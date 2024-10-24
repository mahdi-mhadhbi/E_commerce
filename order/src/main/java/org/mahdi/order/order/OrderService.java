package org.mahdi.order.order;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.mahdi.order.customer.CustomerClient;
import org.mahdi.order.exception.BusinessException;
import org.mahdi.order.kafka.OrdderProducer;
import org.mahdi.order.kafka.OrderConfirmation;
import org.mahdi.order.orderLine.OrderLineRequest;
import org.mahdi.order.orderLine.OrderLineService;
import org.mahdi.order.product.ProductClient;
import org.mahdi.order.product.PurchaseRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final CustomerClient customerClient ;
    private final ProductClient productClient;
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final OrderLineService orderLineService;
    private final OrdderProducer ordderProducer;


    public Integer createdOrder( OrderRequest request) {
        var customer = this.customerClient.findCustomerById(request.customerId()).orElseThrow(()->new BusinessException("cannot crate order :: no customer with this is"));
        var purchasedProds =  this.productClient.purchaseProducts(request.products());

        //persist order
        var order = this.orderRepository.save(orderMapper.toOrder(request));

        //persist order lines
        for(PurchaseRequest purchaseRequest : request.products()){
            orderLineService.saveOrderLine(
                    new OrderLineRequest(null,order.getId(),purchaseRequest.productId(),purchaseRequest.quantity())
            );
        }


        //send the order confirmation
        ordderProducer.sendOrderConfirmation(
                new OrderConfirmation(
                        request.reference(),
                        request.amount(),
                        request.paymentMethod(),
                        customer,
                        purchasedProds
                )
        );
        return order.getId();
    }

    public List<OrderResponse> findAll() {
        return orderRepository.findAll()
                .stream()
                .map(orderMapper::fromOrder)
                .collect(Collectors.toList());
    }

    public OrderResponse findById(Integer orderId) {

        return orderRepository.findById(orderId)
                .map(orderMapper::fromOrder)
                .orElseThrow(()->new EntityNotFoundException(String.format("order with id %s not found", orderId)));
    }
}

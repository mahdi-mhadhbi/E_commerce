<<<<<<< HEAD
package org.mahdi.order.orderLine;


import org.mahdi.order.order.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest orderLineRequest) {

    return OrderLine.builder()
            .id(orderLineRequest.id())
            .quantity(orderLineRequest.quantity())
            .order(Order.builder().id(orderLineRequest.id()).build())
            .productId(orderLineRequest.productId())
            .build();
    }

    public OrderLineResponse toOrderLineRespone(OrderLine orderLine) {

        return new OrderLineResponse(orderLine.getId(), orderLine.getQuantity());
    }
}
=======
package org.mahdi.order.orderLine;


import org.mahdi.order.order.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest orderLineRequest) {

    return OrderLine.builder()
            .id(orderLineRequest.id())
            .quantity(orderLineRequest.quantity())
            .order(Order.builder().id(orderLineRequest.id()).build())
            .productId(orderLineRequest.productId())
            .build();
    }

    public OrderLineResponse toOrderLineRespone(OrderLine orderLine) {

        return new OrderLineResponse(orderLine.getId(), orderLine.getQuantity());
    }
}
>>>>>>> fab77304475c73e6ab9327d90f384b997d38136b

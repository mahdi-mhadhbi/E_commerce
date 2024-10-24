<<<<<<< HEAD
package org.mahdi.order.orderLine;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderLineService {

    private final OrderLineRepository repository;
    private final OrderLineMapper mapper;
    public Integer saveOrderLine(OrderLineRequest orderLineRequest) {
        var order = mapper.toOrderLine(orderLineRequest);

        return repository.save(order).getId();
    }


    public List<OrderLineResponse> findAllByOrderId(Integer orderId) {

        return repository.findAllByOrderId(orderId)
                .stream()
                .map(mapper::toOrderLineRespone)
                .collect(Collectors.toList());
    }
}
=======
package org.mahdi.order.orderLine;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderLineService {

    private final OrderLineRepository repository;
    private final OrderLineMapper mapper;
    public Integer saveOrderLine(OrderLineRequest orderLineRequest) {
        var order = mapper.toOrderLine(orderLineRequest);

        return repository.save(order).getId();
    }


    public List<OrderLineResponse> findAllByOrderId(Integer orderId) {

        return repository.findAllByOrderId(orderId)
                .stream()
                .map(mapper::toOrderLineRespone)
                .collect(Collectors.toList());
    }
}
>>>>>>> fab77304475c73e6ab9327d90f384b997d38136b

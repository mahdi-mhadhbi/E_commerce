package org.mahdi.order.payment;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name="product-service",
        url = "${application.config.payment-ur}"
)
public interface PaymentClient {

    @PostMapping

    Integer requestOrderPayment(@RequestBody PaymentRequest  request);
}

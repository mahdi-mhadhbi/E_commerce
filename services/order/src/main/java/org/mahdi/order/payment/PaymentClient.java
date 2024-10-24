package org.mahdi.order.payment;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name="product-service",
<<<<<<< HEAD
        url = "${application.config.payment-url}"
=======
        url = "${application.config.payment-ur}"
>>>>>>> fab77304475c73e6ab9327d90f384b997d38136b
)
public interface PaymentClient {

    @PostMapping

    Integer requestOrderPayment(@RequestBody PaymentRequest  request);
}

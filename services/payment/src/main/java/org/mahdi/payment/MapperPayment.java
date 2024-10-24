package org.mahdi.payment;

import org.mahdi.payment.payment.Payment;
import org.springframework.stereotype.Service;

@Service
public class MapperPayment {

    public Payment toPayment(PaymentRequest request) {
        return Payment.builder()
                .id(request.id())
                .orderId(request.OrderId())
                .paymentMethod(request.paymentMethod())
                .amount(request.amount())
                .build();
    }
}

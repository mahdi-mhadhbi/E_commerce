package org.mahdi.payment;

import org.mahdi.payment.payment.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(

        Integer id,

        BigDecimal amount,

        PaymentMethod paymentMethod,

        Integer OrderId,

        String OrderReference,

        Customer customer
) {
}

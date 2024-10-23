package org.mahdi.order.payment;

import org.mahdi.order.customer.CustomerResponse;
import org.mahdi.order.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(

        BigDecimal amount,

        PaymentMethod paymentMethod,

        Integer OrderId,

        String OrderReference,

        CustomerResponse customer
) {
}

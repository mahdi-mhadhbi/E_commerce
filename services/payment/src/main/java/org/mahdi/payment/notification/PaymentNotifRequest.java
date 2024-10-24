package org.mahdi.payment.notification;

import org.mahdi.payment.payment.PaymentMethod;

import java.math.BigDecimal;

public record PaymentNotifRequest(

        String orderReference,

        BigDecimal amount ,

        PaymentMethod paymentMethod,

        String customerFirstname,

        String customerLastName,

        String customerEmail
) {
}

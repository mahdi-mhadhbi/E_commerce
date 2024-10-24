<<<<<<< HEAD
package org.mahdi.order.kafka;

import org.mahdi.order.customer.CustomerResponse;
import org.mahdi.order.order.PaymentMethod;
import org.mahdi.order.product.PurchaseRequest;
import org.mahdi.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(

        String orderReference,

        BigDecimal totalAmount,

        PaymentMethod paymentMethod,

        CustomerResponse customer,

        List<PurchaseResponse> products
) {
}
=======
package org.mahdi.order.kafka;

import org.mahdi.order.customer.CustomerResponse;
import org.mahdi.order.order.PaymentMethod;
import org.mahdi.order.product.PurchaseRequest;
import org.mahdi.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(

        String orderReference,

        BigDecimal totalAmount,

        PaymentMethod paymentMethod,

        CustomerResponse customer,

        List<PurchaseResponse> products
) {
}
>>>>>>> fab77304475c73e6ab9327d90f384b997d38136b

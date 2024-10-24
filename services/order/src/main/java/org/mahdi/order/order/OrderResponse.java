<<<<<<< HEAD
package org.mahdi.order.order;

import java.math.BigDecimal;

public record OrderResponse(

        Integer id,

        String reference,

        BigDecimal amount,

        PaymentMethod paymentMethod,

        String customerId
) {
}
=======
package org.mahdi.order.order;

import java.math.BigDecimal;

public record OrderResponse(

        Integer id,

        String reference,

        BigDecimal amount,

        PaymentMethod paymentMethod,

        String customerId
) {
}
>>>>>>> fab77304475c73e6ab9327d90f384b997d38136b

<<<<<<< HEAD
package org.mahdi.order.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PurchaseRequest(
        @NotNull(message = "product is mandatory")
        Integer productId,

        @Positive(message="Quantity is mandatory")
        double quantity
) {
}
=======
package org.mahdi.order.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PurchaseRequest(
        @NotNull(message = "product is mandatory")
        Integer productId,

        @Positive(message="Quantity is mandatory")
        double quantity
) {
}
>>>>>>> fab77304475c73e6ab9327d90f384b997d38136b

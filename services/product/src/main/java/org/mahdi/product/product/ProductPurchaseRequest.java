<<<<<<< HEAD
package org.mahdi.product.product;

import jakarta.validation.constraints.*;

public record ProductPurchaseRequest(
        @NotNull(message = "Product is mandatory")
        Integer productId,
        @Positive(message = "Quantity is mandatory")
        double quantity
) {
}
=======
package org.mahdi.product.product;

import jakarta.validation.constraints.*;

public record ProductPurchaseRequest(
        @NotNull(message = "Product is mandatory")
        Integer productId,
        @Positive(message = "Quantity is mandatory")
        double quantity
) {
}
>>>>>>> fab77304475c73e6ab9327d90f384b997d38136b

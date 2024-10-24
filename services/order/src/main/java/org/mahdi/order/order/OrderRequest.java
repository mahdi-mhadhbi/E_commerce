package org.mahdi.order.order;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.mahdi.order.product.PurchaseRequest;

import java.math.BigDecimal;
import java.util.List;

public record OrderRequest(

        Integer id,

        String reference,
        @Positive(message="Order amount should be positive")
        BigDecimal amount,
        @NotNull(message="payement method should ve precised")
        PaymentMethod paymentMethod,
        @NotNull(message="Custumer should be present")
        @NotEmpty(message="Custumer should be present")
        @NotBlank(message="Custumer should be present")
        String customerId,
        @NotEmpty(message="you should purchasr at least 1 product")
        List<PurchaseRequest> products
) {
}

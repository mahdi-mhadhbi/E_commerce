package org.mahdi.payment;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.Email;

@Validated
public record Customer(
    String id,

    @NotNull(message = "First Name is required")
    String FirstName,
    @NotNull(message = "Last Name is required")
    String LastName,
    @Email(message= "not correctly formated")
    @NotNull(message = "Email is required")

    String Email

) {
}

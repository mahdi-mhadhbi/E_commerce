<<<<<<< HEAD
package org.mahdi.customer.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id ,
        @NotNull(message = "Customer First Name is Required !")
        String firstName,
        @NotNull(message = "Customer Last Name is Required !")
        String lastName,
        @NotNull(message = "Customer Email is Required !")
        @Email(message="Customer Email is not a valid Email Adress")
        String email,
        Adress address
) {
}
=======
package org.mahdi.customer.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id ,
        @NotNull(message = "Customer First Name is Required !")
        String firstName,
        @NotNull(message = "Customer Last Name is Required !")
        String lastName,
        @NotNull(message = "Customer Email is Required !")
        @Email(message="Customer Email is not a valid Email Adress")
        String email,
        Adress address
) {
}
>>>>>>> fab77304475c73e6ab9327d90f384b997d38136b

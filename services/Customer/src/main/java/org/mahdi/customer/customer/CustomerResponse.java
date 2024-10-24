package org.mahdi.customer.customer;



public record CustomerResponse(
        String id,
        String firstName,
        String lastName,
        String email,
        Adress address
) {


}

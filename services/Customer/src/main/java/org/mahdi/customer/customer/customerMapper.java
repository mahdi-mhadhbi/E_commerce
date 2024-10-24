<<<<<<< HEAD
package org.mahdi.customer.customer;


import org.springframework.stereotype.Service;

@Service
public class customerMapper {
    public Customer toCustomer(CustomerRequest request) {

        if(request == null){
            return null;
        }
        return Customer.builder()
                .id(request.id())
                .firstName(request.firstName())
                .lastName(request.lastName())
                .address(request.address())
                .email(request.email())
                .build();
    }
    public CustomerResponse fromCustomer(Customer customer) {
        if (customer == null) {
            return null;
        }
        return new CustomerResponse(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getAddress()
        );
    }
}
=======
package org.mahdi.customer.customer;


import org.springframework.stereotype.Service;

@Service
public class customerMapper {
    public Customer toCustomer(CustomerRequest request) {

        if(request == null){
            return null;
        }
        return Customer.builder()
                .id(request.id())
                .firstName(request.firstName())
                .lastName(request.lastName())
                .address(request.address())
                .email(request.email())
                .build();
    }
    public CustomerResponse fromCustomer(Customer customer) {
        if (customer == null) {
            return null;
        }
        return new CustomerResponse(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getAddress()
        );
    }
}
>>>>>>> fab77304475c73e6ab9327d90f384b997d38136b

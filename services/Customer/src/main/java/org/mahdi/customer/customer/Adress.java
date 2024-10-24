<<<<<<< HEAD
package org.mahdi.customer.customer;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Validated
public class Adress {

    private String street;
    private String houseNumber;
    private String zipCode;
}
=======
package org.mahdi.customer.customer;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Validated
public class Adress {

    private String street;
    private String houseNumber;
    private String zipCode;
}
>>>>>>> fab77304475c73e6ab9327d90f384b997d38136b

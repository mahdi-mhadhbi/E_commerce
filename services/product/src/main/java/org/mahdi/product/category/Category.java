<<<<<<< HEAD
package org.mahdi.product.category;

import jakarta.persistence.*;
import lombok.*;
import org.mahdi.product.product.Product;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
    private List<Product> products;
}
=======
package org.mahdi.product.category;

import jakarta.persistence.*;
import lombok.*;
import org.mahdi.product.product.Product;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
    private List<Product> products;
}
>>>>>>> fab77304475c73e6ab9327d90f384b997d38136b

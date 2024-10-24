<<<<<<< HEAD
package org.mahdi.order.orderLine;


import jakarta.persistence.*;
import lombok.*;
import org.mahdi.order.order.Order;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class OrderLine {

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;
    private Integer productId;
    private Double quantity;

}
=======
package org.mahdi.order.orderLine;


import jakarta.persistence.*;
import lombok.*;
import org.mahdi.order.order.Order;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class OrderLine {

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;
    private Integer productId;
    private Double quantity;

}
>>>>>>> fab77304475c73e6ab9327d90f384b997d38136b

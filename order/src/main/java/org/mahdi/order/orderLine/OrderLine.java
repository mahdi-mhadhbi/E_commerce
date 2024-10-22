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

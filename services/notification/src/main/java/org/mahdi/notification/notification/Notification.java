package org.mahdi.notification.notification;


import lombok.*;
import org.mahdi.notification.kafka.order.OrderConfirmation;
import org.mahdi.notification.kafka.payment.PaymentConfirmation;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document
public class Notification {

    @Id
    private String id;
    private NotificationType type;
    private LocalDateTime notificationDate;
    private OrderConfirmation confirmation;
    private PaymentConfirmation paymentConfirmation;


}

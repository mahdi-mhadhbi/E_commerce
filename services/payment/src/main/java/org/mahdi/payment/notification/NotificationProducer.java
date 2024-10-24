package org.mahdi.payment.notification;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j   //logger field
public class NotificationProducer {

    private final KafkaTemplate<String, PaymentNotifRequest> kafkaTemplate;

    public void sendNotif(PaymentNotifRequest request) {

        log.info("sending notification <{}>", request);

        Message<PaymentNotifRequest> message= MessageBuilder.withPayload(request)
                .setHeader(KafkaHeaders.TOPIC,"payment-topic").build();

        kafkaTemplate.send(message);
    }
}

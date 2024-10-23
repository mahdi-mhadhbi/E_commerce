package org.mahdi.payment;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.mahdi.payment.notification.NotificationProducer;
import org.mahdi.payment.notification.PaymentNotifRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository ;
    private final MapperPayment mapper ;

    private final NotificationProducer notificationProducer ;
    public Integer createPayment( PaymentRequest paymentRequest) {

        var payment = repository.save(mapper.toPayment(paymentRequest));

        notificationProducer.sendNotif(
                new PaymentNotifRequest(
                        paymentRequest.OrderReference(),
                        paymentRequest.amount(),
                        paymentRequest.paymentMethod(),
                        paymentRequest.customer().FirstName(),
                        paymentRequest.customer().LastName(),
                        paymentRequest.customer().Email()
                )
        );
        return payment.getId();
    }
}

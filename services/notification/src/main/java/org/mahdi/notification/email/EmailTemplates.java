package org.mahdi.notification.email;

import lombok.Getter;

public enum EmailTemplates {

    PAYMENT_CONFIRMATION("paymentConfirmation.html","success payment"),

    ORDER_CONFIRMATION("orderConfirmation.html","success payment");


    @Getter
    private final String template;
    @Getter
    private final String subject;


    EmailTemplates(String template, String subject) {
        this.template = template;
        this.subject = subject;
    }

}

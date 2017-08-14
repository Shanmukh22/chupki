package io.egen.injection;

import io.egen.injection.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    //property based DI
    @Autowired
    @Qualifier("amazonEmail")
    private EmailService emailService;

    //constructor based DI
    //@Autowired annotation is optional since Spring 4.x
//    public NotificationService(EmailService emailService) {
//        this.emailService = emailService;
//    }

    public void sendNotification(String to, String message) {
        emailService.sendEmail(to, message);
    }

    //setter based DI
    //useful in cyclic dependencies
//    @Autowired(required = false)
//    public void setEmailService(EmailService emailService) {
//        this.emailService = emailService;
//    }
}
package io.egen.injection.email;

import org.springframework.stereotype.Component;

@Component("googleEmail")
public class GoogleEmailService implements EmailService {

    public void sendEmail(String to, String body) {
        System.out.println("======Using GoogleEmailService======");
        System.out.println("Sending to: " + to);
        System.out.println(body);
        System.out.println("============");
    }
}
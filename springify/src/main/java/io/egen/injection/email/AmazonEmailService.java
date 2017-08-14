package io.egen.injection.email;

import org.springframework.stereotype.Component;

@Component("amazonEmail")
public class AmazonEmailService implements EmailService {

    public void sendEmail(String to, String body) {
        System.out.println("======Using AmazonEmailService======");
        System.out.println("Sending to: " + to);
        System.out.println(body);
        System.out.println("============");
    }
}
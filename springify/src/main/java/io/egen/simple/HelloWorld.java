package io.egen.simple;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HelloWorld {

    public void sayHello() {
        System.out.println("Hello Spring");
    }
}
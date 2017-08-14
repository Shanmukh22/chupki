package io.egen.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        HelloWorld helloWorld1 = context.getBean(HelloWorld.class);
        HelloWorld helloWorld2 = context.getBean(HelloWorld.class);
        helloWorld1.sayHello();

        System.out.println(helloWorld1 == helloWorld2);

        context.close();
    }
}

package io.doubleu0714.spring.core.instantiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstantiationApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("instantiation/spring-config.xml");
        MyBean1 myBean1 = context.getBean("myBean1", MyBean1.class);
        System.out.println(myBean1);
        MyBean2 myBean2 = context.getBean("myBean2", MyBean2.class);
        System.out.println(myBean2);
        MyBean1 myBean3 = context.getBean("myBean1", MyBean1.class);
        System.out.println(myBean3);

        System.out.println("myBean1 == myBean3 : " + (myBean1 == myBean3));
    }
}
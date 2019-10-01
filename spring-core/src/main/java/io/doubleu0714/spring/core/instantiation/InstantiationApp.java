package io.doubleu0714.spring.core.instantiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstantiationApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("instantiation/spring-config.xml");
        ByConstructor byConstructor = context.getBean("byConstructor", ByConstructor.class);
        System.out.println(byConstructor);
        ByConstructor otherByConstructor = context.getBean("byConstructor", ByConstructor.class);
        System.out.println(otherByConstructor);
        System.out.println("byConstructor == otherByConstructor : " + (byConstructor == otherByConstructor));
        ByConstructorWithArgs byConstructorWithArgs = context.getBean("byConstructorWithArgs", ByConstructorWithArgs.class);
        System.out.println(byConstructorWithArgs);

        ByFactoryMethod byFactoryMethod = context.getBean("byFactoryMethod", ByFactoryMethod.class);
        System.out.println(byFactoryMethod);
        ByFactoryMethod OtherByFactoryMethod = context.getBean("factory", ByFactoryMethod.class);
        System.out.println(OtherByFactoryMethod);
        System.out.println("byFactoryMethod == OtherByFactoryMethod : " + (byFactoryMethod == OtherByFactoryMethod));
        ByFactoryMethodWithArgs byFactoryMethodWithArgs = context.getBean("byFactoryMethodWithArgs", ByFactoryMethodWithArgs.class);
        System.out.println(byFactoryMethodWithArgs);

        ByFactoryClassProduct byFactoryClassProduct = context.getBean("byFactoryClassProduct", ByFactoryClassProduct.class);
        System.out.println(byFactoryClassProduct);
        ByFactoryClassProductWithArgs byFactoryClassProductWithArgs = context.getBean("byFactoryClassProductWithArgs", ByFactoryClassProductWithArgs.class);
        System.out.println(byFactoryClassProductWithArgs);
    }
}
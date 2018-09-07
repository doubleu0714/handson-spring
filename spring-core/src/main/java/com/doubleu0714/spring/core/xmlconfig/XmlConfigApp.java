package com.doubleu0714.spring.core.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class XmlConfigApp 
{
    public static void main( String[] args )
    {
        System.out.println("===== Bean create start =====");
        ApplicationContext context = new ClassPathXmlApplicationContext("my-spring-config.xml");
        System.out.println("===== Bean create end =====");
        
        Foo fooWithConstructor = context.getBean("fooWithConstructor", Foo.class);
        fooWithConstructor.foo("Wonhyung");

        Bar bar = context.getBean("barWithStaticFactoryMethod", Bar.class);
        bar.bar("Wonhyung");

        Foo fooWithFactoryInstance = context.getBean("fooWithFactoryInstance", Foo.class);
        fooWithFactoryInstance.foo("Wonhyung");

        System.out.println("fooWithConstructor == fooWithFactoryInstance ? " + (fooWithConstructor == fooWithFactoryInstance));
    }
}

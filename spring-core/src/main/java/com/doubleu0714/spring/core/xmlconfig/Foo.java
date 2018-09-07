package com.doubleu0714.spring.core.xmlconfig;

public class Foo implements IFoo {
    public Foo() {
        System.out.println("called default constructor of Foo");
        // 생성자에 인자값을 추가할 경우 위처럼 default constructor 가 존재 해야함. default constructor 가 없다면 bean 생성시 아래의 에러발생
        // ------------------------------------------------------------------------------------------------------------------------------
        // Caused by: java.lang.NoSuchMethodException: com.doubleu0714.spring.core.xmlconfig.Foo.<init>()
        // at java.lang.Class.getConstructor0(Class.java:3082)
        // at java.lang.Class.getDeclaredConstructor(Class.java:2178)
        // at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:78)
        // ... 14 more
    }

    public Foo(String name) {
        System.out.println("called constructor with name of Foo");
    }

    public void foo(String name) {
        System.out.println("Foo : " + name + " Hello!!");
    }
}
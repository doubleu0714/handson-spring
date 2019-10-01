package io.doubleu0714.spring.core;

public class InitWithFactoryMethod {

    private InitWithFactoryMethod() {

    }

    public static InitWithFactoryMethod createInstance() {
        // bean 설정의 attribute 인 factory-method에 설정된 메소드를 호출함.
        return new InitWithFactoryMethod();
    }

    public void init() {
        System.out.println("Initialized InitWithFactoryMethod!!");
    }
}
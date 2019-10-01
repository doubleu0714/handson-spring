package io.doubleu0714.spring.core;

public class InitWithFactory {
    public void init() {
        System.out.println("Initialized InitWithFactory!!");
    }
}

class ServiceLocator {
    private static InitWithFactory initWithFactory = new InitWithFactory();

    public InitWithFactory createInitWithFactory() {
        return initWithFactory;
    }

    public void init() {
        System.out.println("Initialized ServiceLocator!!");
    }
}
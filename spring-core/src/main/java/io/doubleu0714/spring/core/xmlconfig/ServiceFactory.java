package io.doubleu0714.spring.core.xmlconfig;

public class ServiceFactory {
    private static Foo foo = new Foo();

    public Foo createFooInstance() {
        return foo;
    }
}
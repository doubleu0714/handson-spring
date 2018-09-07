package com.doubleu0714.spring.core.javaconfig;

public class Bar {
    private IFoo foo;

    public IFoo getFoo() {
        return this.foo;
    }

    public void setFoo(IFoo foo) {
        this.foo = foo;
    }

    public void print() {
        System.out.println("Hello Bar");
        foo.print();
    }
}
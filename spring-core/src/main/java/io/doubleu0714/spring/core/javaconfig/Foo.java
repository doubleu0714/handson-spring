package io.doubleu0714.spring.core.javaconfig;

public class Foo implements IFoo{
    private String test;
    public Foo() {
        System.out.println("Create Foo!!!");
    }
    @Override
    public void print() {
        System.out.println("Hello Foo");
    }
}
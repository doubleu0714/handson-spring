package com.doubleu0714.spring.core;

import org.springframework.beans.factory.annotation.Required;

public class DIWithContructorBase {
    private Foo foo;
    private Bar bar;

    public DIWithContructorBase() {

    }

    public DIWithContructorBase(Foo foo, Bar bar) {
        System.out.println("Contructor of DIWithContructorBase is called");
        this.foo = foo;
        this.bar = bar;
    }
    
    public void init() {
        foo.print();
        bar.print();
        System.out.println("Initialized DIWithContructorBase!!");
    }
}
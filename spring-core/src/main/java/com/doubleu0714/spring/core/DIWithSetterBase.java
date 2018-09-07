package com.doubleu0714.spring.core;

import org.springframework.beans.factory.annotation.Required;

public class DIWithSetterBase {
    private Foo foo;
    private Bar bar;

    public DIWithSetterBase() {
        System.out.println("Contructor of DIWithSetterBase is called");
        
        // foo.print();
        // bar.print();
    }

    public Foo getFoo() {
        return this.foo;
    }
    
    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public Bar getBar() {
        return this.bar;
    }
    
    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public void init() {
        System.out.println("Initialized DIWithContructorBase!!");
        foo.print();
        bar.print();
    }
}
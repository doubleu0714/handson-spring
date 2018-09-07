package com.doubleu0714.spring.core;

public class MyBean {
    public void init() {
        System.out.println("initialized MyBean!!");
    }

    public void print(String name) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello ");
        builder.append(name);

        System.out.println(builder.toString());
    }
}
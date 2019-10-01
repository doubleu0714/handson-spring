package io.doubleu0714.spring.core.xmlconfig;

public class Bar implements IBar {
    private static Bar bar = new Bar();

    private Bar () {
        System.out.println("called private default constructor of Bar");
    }

    public static Bar createInstance() {
        System.out.println("called factory method of Bar");
        return bar;
    }
    
    public void bar(String name) {
        System.out.println("Bar : " + name + " Hello!!");
    }
}
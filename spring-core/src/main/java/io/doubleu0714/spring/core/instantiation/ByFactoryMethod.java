package io.doubleu0714.spring.core.instantiation;

public class ByFactoryMethod {
    private static ByFactoryMethod bean = new ByFactoryMethod();
    private int val1;
    private String val2;
    private ByFactoryMethod() {
        this.val1 = 1515;
        this.val2 = "Hello ByFactoryMethod";
    }

    public static ByFactoryMethod of() {
        return bean;
    }

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    @Override
    public String toString() {
        return "ByFactoryMethod{" +
                "val1=" + val1 +
                ", val2='" + val2 + '\'' +
                '}';
    }
}
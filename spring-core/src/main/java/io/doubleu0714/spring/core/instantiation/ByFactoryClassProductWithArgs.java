package io.doubleu0714.spring.core.instantiation;

public class ByFactoryClassProductWithArgs {
    private int val1;
    private String val2;

    public ByFactoryClassProductWithArgs(int arg1, String arg2) {
        this.val1 = arg1;
        this.val2 = arg2;
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
        return "ByFactoryClassProductWithArgs{" +
                "val1=" + val1 +
                ", val2='" + val2 + '\'' +
                '}';
    }
}

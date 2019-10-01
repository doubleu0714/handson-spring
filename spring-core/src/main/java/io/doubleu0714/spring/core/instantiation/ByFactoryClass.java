package io.doubleu0714.spring.core.instantiation;

public class ByFactoryClass {
    private static ByFactoryClassProduct product = new ByFactoryClassProduct();

    public ByFactoryClassProduct createProduct() {
        return product;
    }

    public ByFactoryClassProductWithArgs createProduct(int arg1, String arg2) {
        return new ByFactoryClassProductWithArgs(arg1, arg2);
    }
}

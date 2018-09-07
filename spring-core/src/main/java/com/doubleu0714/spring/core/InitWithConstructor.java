package com.doubleu0714.spring.core;

public class InitWithConstructor {
    public InitWithConstructor() {
        //
    }
    public InitWithConstructor(String name) {
        // 생성자에 인자값을 추가할 경우 위처럼 default constructor 가 존재 해야함. default constructor 가 없다면 bean 생성시 에러발생
    }    

    public void init() {
        System.out.println("Initialized InitWithConstructor!!");
    }
}
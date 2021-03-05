package com.factory.func;

public class FactoryTest {

    public static void main(String[] args) {

        Factory factory = new TelunsuFactory();
        System.out.println(factory.getMilk().getName());

    }
}

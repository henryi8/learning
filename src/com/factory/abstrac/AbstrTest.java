package com.factory.abstrac;

public class AbstrTest {

    public static void main(String[] args) {

        MilkFactory milkFactory = new MilkFactory();

        System.out.println(milkFactory.getMenNiuMilk().getName());
    }
}

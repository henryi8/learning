package com.factory.simple;

import com.factory.Menniu;

public class Test {

    public static void main(String[] args) {
        System.out.println(new Menniu().getName());
        Factory factory = new Factory();
        factory.getMikeName("特仑苏");

        System.out.println(factory.getMikeName("特仑苏").getName());
    }
}

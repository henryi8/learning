package com.single.test;

/**
 * @author 赵星宇
 * @date 2017/12/20 23:22
 */
public class MainTest {
    public static void main(String[] args) {
        ESingleTest eSingleTest = ESingleTest.getESingleTest();
        eSingleTest.setName("帅哥");
        ESingleTest eSingleTest1 = ESingleTest.getESingleTest();
        eSingleTest1.setName("美女");
        eSingleTest.pringln();
        eSingleTest1.pringln();

    }
}

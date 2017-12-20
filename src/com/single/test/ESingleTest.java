package com.single.test;

/**
 * @author 赵星宇
 * @date 2017/12/20
 */
public class ESingleTest {
    private static String name;

    private static ESingleTest eSingleTest = new ESingleTest();

    public static ESingleTest getESingleTest(){
        return eSingleTest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void pringln(){
        System.out.println("this name is" + name);
    }
}

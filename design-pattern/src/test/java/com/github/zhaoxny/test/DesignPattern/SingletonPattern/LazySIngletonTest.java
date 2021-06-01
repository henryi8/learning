package com.github.zhaoxny.test.DesignPattern.SingletonPattern;

/**
 * @author henry
 * @date 2021/5/18 23:47
 */
public class LazySIngletonTest {

    public static void main(String[] args) {

        Thread threadTest1 = new Thread(new ThreadTest());
        Thread threadTest2 = new Thread(new ThreadTest());

        threadTest1.start();
        threadTest2.start();
        System.out.println("Thread end");
    }
}

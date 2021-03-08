package com.github.zhaoxny.learning.day001.duoxiancheng;

/**
 * 多线程
 */
public class RunableTest implements Runnable {
    @Override
    public void run() {
        System.out.println("开始");
    }

    public static void main(String[] args) {
        RunableTest test = new RunableTest();
        test.run();
    }
}

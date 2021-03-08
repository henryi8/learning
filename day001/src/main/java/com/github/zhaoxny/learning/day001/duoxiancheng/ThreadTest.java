package com.github.zhaoxny.learning.day001.duoxiancheng;

public class ThreadTest extends Thread{

    @Override
    public void run(){
        System.out.println("xiancheng");
    }

    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.start();
    }
}

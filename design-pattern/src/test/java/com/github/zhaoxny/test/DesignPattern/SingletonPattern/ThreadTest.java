package com.github.zhaoxny.test.DesignPattern.SingletonPattern;

import com.github.zhaoxny.SingletonPattern.LazySingleton.LazyDoubleCheck;
import com.github.zhaoxny.SingletonPattern.LazySingleton.LazySimple;

/**
 * @author henry
 * @date 2021/5/29 22:09
 */
public class ThreadTest implements Runnable{


    public void run() {
//        LazySimple lazySimple = LazySimple.getInstance();
        LazyDoubleCheck lazySimple = LazyDoubleCheck.getInstance();

        System.out.println(Thread.currentThread().getName()+":"+lazySimple);
    }


}

package com.single;

/**
 * @author 赵星宇
 * @date 2017/12/20
 * 单例模式：一般分为【懒汉模式；饿汉模式；登记式模式】
 * 特点：1：单例只有一个实例
 *      2：单例类必须自己创建自己的唯一实例
 *      3：单例类必须给其他所有对象提供这一实例
 *
 */

/**
 * 单例-->懒汉模式
 */
public class LSingle {

    private static LSingle lSingle = null;

    public static LSingle getlSingle() {
        if(lSingle == null){
            lSingle = new LSingle();
        }
        return lSingle;
    }
    /**
     * 此模式没有考虑线程安全的问题。
     * 在多并发的情况下，可能创建多个Single的实例、
     * 要实现线程安全，有以下三种方式，都是对getInstance这个方法改造，保证了懒汉式单例的线程安全。
     * 如果你第一次接触单例模式，对线程安全不是很了解，可以先跳过下面这三小条，去看饿汉式单例，
     *
     * 懒汉模式比较懒，是要调用getlSingle的时候，才会初始化这个实例；
     */


}


package com.github.zhaoxny.SingletonPattern.HungrySingleton;

/**
 * 饿汉式单例1
 * @author henry
 * @date 2021/5/18 23:36
 */
public class Hungry {

    private static final Hungry hungry = new Hungry();

    private Hungry(){

    }

    public static Hungry getInstance(){
        return hungry;
    }

}

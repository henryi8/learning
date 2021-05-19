package com.github.zhaoxny.SingletonPattern.HungrySingleton;

/**
 * 饿汉式单例2
 * @author henry
 * @date 2021/5/18 23:38
 */
public class HungryStatic {

    private static final HungryStatic hungryStatic;

    //类加载的时候立即初始化
    static {
        hungryStatic = new HungryStatic();
    }

    private HungryStatic(){

    }

    public static HungryStatic getInstance(){
        return hungryStatic;
    }
}

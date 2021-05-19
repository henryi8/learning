package com.github.zhaoxny.SingletonPattern.LazySingleton;

/**
 * 懒汉式单例
 * @author henry
 * @date 2021/5/18 23:42
 */
public class LazySimple {

    private static LazySimple lazySimple = null;

    private LazySimple (){}

    public static LazySimple getInstance(){
        lazySimple = new LazySimple();
        return lazySimple;
    }

}

package com.github.zhaoxny.SingletonPattern.LazySingleton;

/**
 * 懒汉式单例
 * @author henry
 * @date 2021/5/18 23:42
 */
public class LazySimple {

    private static LazySimple lazySimple = null;

    private LazySimple (){}


    //jdk1.6后对synchronize性能优化了不少，不可避免的还是存在一定的性能问题
    public synchronized static LazySimple getInstance(){
        if(lazySimple == null) {
            lazySimple = new LazySimple();
        }
        return lazySimple;
    }

}

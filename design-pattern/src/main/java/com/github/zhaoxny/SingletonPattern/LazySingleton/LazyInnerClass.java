package com.github.zhaoxny.SingletonPattern.LazySingleton;

/**
 * 静态内部类--（性能最优的写法）
 * @author henry
 * @date 2021/5/30 10:24
 */
//没有用到synchronized
public class LazyInnerClass {

    //虽然构造方法私有了，但是逃不过反射的法眼。
    private LazyInnerClass (){
        if (LazyHolder.lazy != null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    //内部类比外部类优先加载。懒汉式单例
    //LazyHolder里面的逻辑需要等到外部方法调用时才执行，巧妙的利用了内部类的特性，JVM底层执行逻辑，完美的避免的线程安全的问题。
    public static final LazyInnerClass getInstance(){
        return  LazyHolder.lazy;
    }

    private static class LazyHolder{
        private static final  LazyInnerClass lazy = new LazyInnerClass();
    }


}

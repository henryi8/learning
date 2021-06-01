package com.github.zhaoxny.SingletonPattern.LazySingleton;

/**
 * 懒汉式双重检查
 * @author henry
 * @date 2021/5/29 21:57
 */
public class LazyDoubleCheck {

    private volatile static LazyDoubleCheck lazyDoubleCheck = null;

    private LazyDoubleCheck (){}

    //双重锁
    public static LazyDoubleCheck getInstance(){
        if(lazyDoubleCheck == null){
            synchronized (LazyDoubleCheck.class){
                if(lazyDoubleCheck == null) {//如果不加这个判断，多个线程还是会进来，会被new多次
                    lazyDoubleCheck = new LazyDoubleCheck();
                    //cpu执行的时候会转换为JVM指令执行，
                    //（2.3可能先后顺序，指令重排序的问题，volatile）
                    // 1，分配内存给这个对象
                    // 2.初始化对象
                    // 3.将初始化好的对象和内存地址简历关联，赋值
                    // 4. 用户初次访问
                }
            }
        }
        return lazyDoubleCheck;
    }



}

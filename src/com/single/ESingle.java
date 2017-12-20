package com.single;

/**
 * @author 赵星宇
 * @date 2017/12/20
 * 单例模式-->饿汉模式
 *  一加载这个类，就把这个实例初始化完成，能保证geteSingle的时候，这个单例在之前就已经存在。
 */
public class ESingle {

    // 以后不再改变，所以天生是线程安全的。
    private static final ESingle eSingle = new ESingle();

    public static ESingle geteSingle() {
        return eSingle;
    }

}

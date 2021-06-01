package com.github.zhaoxny.SingletonPattern.registerSingleton;

/**
 * 枚举式单例
 * @author henry
 * @date 2021/5/30 11:14
 */
public enum Enum {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public static Enum getInstance(){
        return INSTANCE;
    }

}

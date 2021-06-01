package com.github.zhaoxny.SingletonPattern.SeriableSingleton;

import java.io.Serializable;

/**
 * @author henry
 * @date 2021/5/30 10:52
 */
public class SeriableHungry implements Serializable {

    private static final SeriableHungry hungry = new SeriableHungry();

    private SeriableHungry(){

    }

    public static SeriableHungry getInstance(){
        return hungry;
    }

    //重写readResolve方法，只不过是覆盖了反序列化出来的对象。
    //还是创建了两次，发生在jvm层面，相对来说比较安全
    //之前反序列化出来的对象会被GC回收
    private Object readResolve(){
        return hungry;
    }

}

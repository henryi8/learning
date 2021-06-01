package com.github.zhaoxny.test.DesignPattern.SingletonPattern;

import com.github.zhaoxny.SingletonPattern.LazySingleton.LazyInnerClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 1 内部类反射调用破坏单例（模拟）
 * @author henry
 * @date 2021/5/30 10:33
 */
//解决办法：在构造方法中直接抛出异常，禁止反射获取单例
public class LazyInnerClassTest {

    public static void main(String[] args) {
        Class<?> clazz = LazyInnerClass.class;

        try {
            //构建者装逼，不走寻常路，破坏单例
            Constructor<?> c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);//强制访问
            Object o = c.newInstance();

            Object o1 = LazyInnerClass.getInstance();

            //看是否是同一个对象，如果false就说明还是会有问题。
            System.out.println(o == o1);



        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}

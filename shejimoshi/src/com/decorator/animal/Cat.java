package com.decorator.animal;

/**
 * Created by Administrator on 2017/12/4.
 */
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("猫吃什么呢");
    }

    @Override
    public void hair() {
        System.out.println("猫是什么颜色呢");
    }
}

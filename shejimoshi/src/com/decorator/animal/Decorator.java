package com.decorator.animal;

/**
 * 装饰类
 * 继承动物接口，实现基本的方法
 * Created by Administrator on 2017/12/4.
 */
public abstract class Decorator implements Animal{
    private Animal animal;

    public Decorator (Animal animal){
        this.animal = animal;
    }

    public void eat(){
        animal.eat();
    }

    public void hair(){
        animal.hair();
    }
}

package com.strategic.oo;

/**
 * 策略模式
 * @author 赵星宇
 * @date 2019/8/21 22:48
 */
public abstract class Duck {

    public Duck(){

    }
    public abstract void display();

    public void sound(){
        System.out.println("gagaga");
    }

    public void swim(){
        System.out.println("i can swim");
    }

}

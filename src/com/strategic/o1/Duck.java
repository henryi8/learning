package com.strategic.o1;

/**
 * @author 赵星宇
 * @date 2019/8/21 23:22
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    SoundBehavior soundBehavior;

    public Duck() {
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void sound(){
        soundBehavior.sound();
    }

    public abstract void display();

}

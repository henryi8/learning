package com.strategic.o1;

/**
 * @author 赵星宇
 * @date 2019/8/21 23:24
 */
public class GreenDuck extends Duck{
    public GreenDuck() {
        flyBehavior = new GreenFlyBehavior();
        soundBehavior = new GreenSoundBehavior();
    }

    @Override
    public void display() {
        System.out.println("我是绿的");
    }


}

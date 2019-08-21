package com.strategic.o1;

/**
 * @author 赵星宇
 * @date 2019/8/21 23:25
 */
public class RedDuck extends Duck{

    public RedDuck() {
        flyBehavior = new RedFlyBehavior();
        soundBehavior = new RedSoundBehavior();
    }

    @Override
    public void display() {
        System.out.println("我是红的");
    }

}

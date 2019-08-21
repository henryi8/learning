package com.strategic.oo;

/**
 * @author 赵星宇
 * @date 2019/8/21 23:09
 */
public class RunDuck {

    /**
     * 当添加新的需求（会飞），直接在超类中添加的话，万一有的子类不需要，那就重复了。
     * 直接在子类中重写，那就导致代码复杂度。所以就考虑策略模式。
     *
     * @param args
     */
    public static void main(String[] args) {
        RedDuck redDuck = new RedDuck();
        GreenDyck greenDyck = new GreenDyck();

        redDuck.display();
        redDuck.swim();
        redDuck.sound();

        greenDyck.display();
        greenDyck.swim();
        greenDyck.sound();
    }

}

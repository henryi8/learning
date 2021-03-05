package com.strategic.o1;



/**
 * @author 赵星宇
 * @date 2019/8/21 23:26
 */
public class Run {

    public static void main(String[] args) {

        RedDuck redDuck = new RedDuck();
        GreenDuck greenDuck = new GreenDuck();

        redDuck.display();
        redDuck.fly();
        redDuck.sound();

        greenDuck.display();
        greenDuck.fly();
        greenDuck.sound();

    }
}

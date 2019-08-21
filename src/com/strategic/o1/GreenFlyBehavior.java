package com.strategic.o1;

/**
 * @author 赵星宇
 * @date 2019/8/21 23:31
 */
public class GreenFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我是绿鸭，不会飞");
    }
}

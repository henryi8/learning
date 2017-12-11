package com.decorator.animal;

/**
 * Created by Administrator on 2017/12/4.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Decorator decorator = new Decorator_2(new Decorator_1(animal));
        decorator.eat();
        decorator.hair();
    }

    //运行结果：
//    猫吃什么呢
//            吃猫粮
//    奥利奥牌的
//            猫是什么颜色呢
//    毛发颜色
//            黄色
}

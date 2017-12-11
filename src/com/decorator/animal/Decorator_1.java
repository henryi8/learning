package com.decorator.animal;

/**
 * Created by Administrator on 2017/12/4.
 */
public class Decorator_1 extends Decorator{
    public Decorator_1(Animal animal) {
        super(animal);
    }

    public void eatWhat(){
        System.out.println("吃猫粮");
    }

    public void hairColor(){
        System.out.println("毛发颜色");
    }

    @Override
    public void eat() {
        super.eat();
        eatWhat();
    }

    @Override
    public void hair(){
        super.hair();
        hairColor();
    }

}

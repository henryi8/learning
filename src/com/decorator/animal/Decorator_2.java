package com.decorator.animal;

/**
 * Created by Administrator on 2017/12/4.
 */
public class Decorator_2 extends Decorator {
    public Decorator_2(Animal animal) {
        super(animal);
    }

    public void eatthing() {
        System.out.println("奥利奥牌的");
    }

    public void hairthing() {
        System.out.println("黄色");
    }

    @Override
    public void eat() {
        super.eat();
        eatthing();
    }

    @Override
    public void hair() {
        super.hair();
        hairthing();
    }
}

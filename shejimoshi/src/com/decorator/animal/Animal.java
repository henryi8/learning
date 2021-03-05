package com.decorator.animal;

/**
 * 动物接口
 * 设计模式之装饰模式
 * 定义：动态给一个对象添加一些额外的职责,就象在墙上刷油漆.使用Decorator模式相比用生成子类方式达到功能的扩充显得更为灵活。
 * Created by Administrator on 2017/12/4.
 * http://blog.csdn.net/jason0539/article/details/22713711
 */
public interface Animal {
    void eat();

    void hair();
}

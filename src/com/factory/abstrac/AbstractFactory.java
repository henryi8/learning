package com.factory.abstrac;

import com.factory.Milk;

/**
 * 抽象工厂是用户的入口
 * 在spring中应用的非常广泛的一种设计
 * 易于拓展
 */
public abstract class AbstractFactory {

    abstract Milk getMenNiuMilk();

    abstract Milk TelunsuMilk();

}

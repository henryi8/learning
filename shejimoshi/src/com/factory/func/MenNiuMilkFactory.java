package com.factory.func;

import com.factory.Menniu;
import com.factory.Milk;

public class MenNiuMilkFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new Menniu();
    }
}

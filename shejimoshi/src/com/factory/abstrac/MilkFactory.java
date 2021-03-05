package com.factory.abstrac;

import com.factory.Menniu;
import com.factory.Milk;
import com.factory.Telunsu;

public class MilkFactory extends AbstractFactory{

    @Override
    Milk getMenNiuMilk() {
        return new Menniu();
    }

    @Override
    Milk TelunsuMilk() {
        return new Telunsu();
    }

}

package com.factory.func;

import com.factory.Milk;
import com.factory.Telunsu;

public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}

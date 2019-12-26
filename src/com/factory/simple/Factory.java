package com.factory.simple;

import com.factory.Milk;
import com.factory.Telunsu;

public class Factory {

    public Milk getMikeName(String milkName){
        if("特仑苏".equals(milkName))
        return new Telunsu();
        return null;
    }

}

package com.strategic.o2;

/**
 * @author zhaoxingyu
 * @description
 * @created 2019/8/22
 * @modified by zhaoxingyu on 2019/8/22
 */
public abstract class Way {

    HelpBag helpBag;

    public abstract void help();


    public void go(){
        helpBag.openWay();
    }

}

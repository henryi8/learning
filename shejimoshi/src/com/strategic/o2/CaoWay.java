package com.strategic.o2;

/**
 * @author zhaoxingyu
 * @description
 * @created 2019/8/22
 * @modified by zhaoxingyu on 2019/8/22
 */
public class CaoWay extends Way{


    public CaoWay(HelpBag h) {
        helpBag = h;
    }

    @Override
    public void help() {
        System.out.println("曹操的方法");
    }
}

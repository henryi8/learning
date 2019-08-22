package com.strategic.o2;

/**
 * @author zhaoxingyu
 * @description
 * @created 2019/8/22
 * @modified by zhaoxingyu on 2019/8/22
 */
public class ZhaoWay extends Way{


    public ZhaoWay(HelpBag h) {
        helpBag = h;
    }

    @Override
    public void help() {
        System.out.println("赵云的方法");
    }
}

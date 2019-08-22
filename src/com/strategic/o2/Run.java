package com.strategic.o2;

/**
 * @author zhaoxingyu
 * @description
 * @created 2019/8/22
 * @modified by zhaoxingyu on 2019/8/22
 */
public class Run {

    public static void main(String[] args) {
        ZhaoWay zhaoWay = new ZhaoWay(new FHelpBag());
        CaoWay caoWay = new CaoWay(new SHelpBag());

        zhaoWay.help();
        zhaoWay.go();
        caoWay.help();
        caoWay.go();
    }
}

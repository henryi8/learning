package com.single;

/**
 * @author 赵星宇
 * @date 2017/12/20
 * 懒汉模式之--（线程安全-静态内部类）
 */
public class LSingleSafe3 {

    public static class nabunei{
        private static LSingleSafe3 lSingleSafe3 = new LSingleSafe3();
    }

    public static LSingleSafe3 getlSingleSafe3(){
        return nabunei.lSingleSafe3;
    }
}

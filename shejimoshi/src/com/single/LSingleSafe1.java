package com.single;

/**
 * @author 赵星宇
 * @date 2017/12/20
 */
public class LSingleSafe1 {

    private static LSingleSafe1 lSingleSafe1 = null;

    public LSingleSafe1(){}

    //添加一个同步关键字
    public static synchronized LSingleSafe1 getLSingleSafe1(){
        if(lSingleSafe1 == null){
            lSingleSafe1 = new LSingleSafe1();
        }
        return lSingleSafe1;
    }
}

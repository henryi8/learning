package com.single;

/**
 * @author 赵星宇
 * @date 2017/12/20
 * 双重检查锁定
 */
public class LSingleSafe2 {
    private static LSingleSafe2 lSingleSafe2 = null;

    public static LSingleSafe2 getlSingleSage2() {
        if (lSingleSafe2 == null) {
            synchronized (LSingleSafe2.class){
                if(lSingleSafe2 == null){
                    lSingleSafe2 = new LSingleSafe2();
                }
            }
        }
        return lSingleSafe2;
    }
}

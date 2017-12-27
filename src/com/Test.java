package com;

import com.single.ESingle;

/**
 * @author 赵星宇
 * @date 2017/12/20
 */
public class Test {

    public static void main(String[] args) {
//        ESingle eSingle = ESingle.geteSingle();
//        tes2 t = new tes2();
//        t.test();
            String a = "hello2";
            final String b = "hello";
            String d = "hello";
            String c = b + 2;
            String e = d + 2;
            System.out.println((a == c));
            System.out.println((a == e));
    }
}

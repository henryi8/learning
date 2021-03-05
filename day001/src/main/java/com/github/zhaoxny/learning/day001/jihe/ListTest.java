package com.github.zhaoxny.learning.day001.jihe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * list集合分为{ArrayList, LinkList, Vector}
 */
public class ListTest {

    public static void main(String[] args) {
        /**
         * ArrayList: 底层是数组的集合，可以快速的随机访问集合中的元素。
         *            线程不安全，
         */
        List<Integer> intList = new ArrayList<>();

        /**
         * LinkedList: 底层是链表结构，可以快速的插入删除，随机访问速度不如ArrayList。
         *             线程不安全
         */
        List<String> strList = new LinkedList<>();

        /**
         * Vector: 底层是数组和ArrayList差不多，但是它的方法上面都加了synchronized，效率比ArrayList慢
         *          线程安全
         */
        List<Integer> vector = new Vector<>();

    }

}

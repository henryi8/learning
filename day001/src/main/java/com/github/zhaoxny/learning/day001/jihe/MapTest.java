package com.github.zhaoxny.learning.day001.jihe;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Map集合分为｛HashMap,LinkedMap,TreeMap,HashTable,ConcurrentHashMap｝
 *  是一个key-value键值对，不允许有重复的key，允许有null。
 */
public class MapTest {

    public static void main(String[] args) {

        /**
         * HashMap: 是由Key-Value的键值对，key值的顺序是不确定性的。
         *          负载因子是0.75，扩容的阈值是数组大小*负载因子。
         *          底层的结构1.7之前是数组+链表，1.8之后是数组+链表+红黑树，
         *          链表中的元素超过8个之后就会转为红黑树。
         *          线程不安全。
         */
        Map<String,Object> strMap = new HashMap<>();

        /**
         * LinkedHashMap: 是HashMap的子类，保存了插入的顺序。
         */
        Map<String,Object> strLinkMap = new LinkedHashMap<>();

        /**
         *
         */
        Map<String,Object> strTreeMap = new TreeMap<>();

        Map<Integer,Object> intMap = new Hashtable<>();

        Map<Integer,Object> curMap = new ConcurrentHashMap<>();

    }

}

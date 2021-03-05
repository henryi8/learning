package com.github.zhaoxny.learning.day001.jihe;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Map集合分为｛HashMap,LinkedMap,TreeMap,HashTable,ConcurrentHashMap｝
 */
public class MapTest {

    public static void main(String[] args) {

        /**
         * HashMap:
         */
        Map<String,Object> strMap = new HashMap<>();

        Map<String,Object> strLinkMap = new LinkedHashMap<>();

        Map<String,Object> strTreeMap = new TreeMap<>();

        Map<Integer,Object> intMap = new Hashtable<>();

        Map<Integer,Object> curMap = new ConcurrentHashMap<>();

    }

}

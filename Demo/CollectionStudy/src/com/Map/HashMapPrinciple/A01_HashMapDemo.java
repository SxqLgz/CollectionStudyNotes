package com.Map.HashMapPrinciple;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class A01_HashMapDemo {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);

        ConcurrentHashMap<String ,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("A", 1);
        concurrentHashMap.put("B", 2);

    }
}

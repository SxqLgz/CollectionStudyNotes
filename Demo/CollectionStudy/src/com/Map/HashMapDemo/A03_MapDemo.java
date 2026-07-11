package com.Map.HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A03_MapDemo {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式:键值对
        //1、创建Map对象
        Map<String, String> map = new HashMap<>();
        //2、添加元素
        map.put("111", "222");
        map.put("333", "444");
        map.put("555", "666");

        //3、遍历键值对
        //3.1获取所有的键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //3.2遍历所有的键值对
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        entries.forEach((Map.Entry<String, String> entry) -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        });

    }
}

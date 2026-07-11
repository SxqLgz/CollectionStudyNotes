package com.Map.HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A02_MapDemo {
    public static void main(String[] args) {

        //Map集合的第一种遍历方式:键找值
        //三个课堂练习:
        //练习一:利用键找值的方式遍历map集合，要求:装着键的单列集合使用增强for的形式进行遍历
        //1、创建Map对象
        Map<String, String> map = new HashMap<>();

        //2、添加元素
        map.put("111", "222");
        map.put("333", "444");
        map.put("555", "666");

        //3、通过键找值
        //3.1获取所有的键
        Set<String> keySet = map.keySet();
        //3.2遍历所有的键
        for (String key : keySet) {
            //3.3通过键找值
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        keySet.forEach(key ->{
                String value = map.get(key);
                System.out.println(key + "=" + value);
        });

    }
}

package com.Map.HashMapDemo;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo {
    public static void main(String[] args) {
        //                      了解Map的实现类和方法
        /**
         * put(K key,V value)                       添加元素
         * V remove(object key)                     根据键删除键值对元素
         * void clear()                             移除所有的键值对元素
         * boolean containsKey(Object key)          判断集合是否包含指定的键
         * boolean containsValue(Object value)      判断集合是否包含指定的值
         * boolean isEmpty()                        判断集合是否为空
         * int size()                               集合的长度，也就是集合中键值对的个数
         */
        //1、创建Map对象
        Map<String, String> map = new HashMap<>();

        //2、添加元素
        //put方法的细节:put方法的功能:添加/覆盖
        // 在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中，方法返回nu11
        // 在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。
        map.put("111", "222");

        String put1 = map.put("333", "444");
        System.out.println(put1);

        map.put("555", "666");

        String put2 = map.put("111", "777");//"111"键已存在,会将已被覆盖的值进行返回
        System.out.println(put2);

        System.out.println(map);

    }
}

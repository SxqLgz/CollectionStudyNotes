package com.Map.TreeMapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class A01_TreeMapDemo {
    public static void main(String[] args) {
        /**
         * 需求:字符串“aababcabcdabcde”
         * 请统计字符串中每一个字符出现的次数，并按照以下格式输出
         * 输出结果:
         * a (5) b (4) c (3) d (2) e (1)
         */

        /**
         * 统计思想:利用map集合进行统计
         * 如果题目中没有要求对结果进行排序，默认使用HashMap
         * 如果题目中要求对结果进行排序，请使用TreeMap
         * 键:表示要统计的内容
         * 值:表示次数
         */
        //1、定义一个字符串
        String s = "aababcabcdabcde";
        //2、创建集合
        TreeMap<Character,Integer> TM = new TreeMap<>();
        //3、遍历字符串，转为字符，存入集合
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //判断否存在集合中，存入集合
            if(TM.containsKey(c)){
                int count = TM.get(c);
                count++;
                TM.put(c,count);
            }else {
                TM.put(c,1);
            }
        }
        //4、遍历集合按指定格式输出
        StringBuilder sb = new StringBuilder();
        //forEach遍历
        Set<Map.Entry<Character,Integer>> entries = TM.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            char key = entry.getKey();
            int value = entry.getValue();
            sb.append(key).append("(").append(value).append(")");
        }
        System.out.println(sb);
        //迭代器遍历
        Iterator iterator = TM.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Character,Integer> entry = (Map.Entry<Character, Integer>) iterator.next();
            char key = entry.getKey();
            int value = entry.getValue();
            sb.append(key).append("(").append(value).append(")");
        }
        System.out.println(sb);
        //Lambda函数遍历
        TM.forEach((Character key, Integer value)-> sb.append(key).append("(").append(value).append(")"));

        System.out.println(sb);
    }
}

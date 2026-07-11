package com.Map.HashMapDemo;

import java.util.*;

public class A04_HashMapDemo {
    public static void main(String[] args) {
        /**
         * 某个班级80名学生，现在需要组成秋游活动，
         * 班长提供了四个景点依次是(A、B、C、D)，
         * 每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
         */

        //1、使用集合存放投票结果
        String[] array = {"A", "B", "C", "D"};//存放4个景点
        List<String> result = new ArrayList<>();//存放结果
        Random random = new Random();//生成随机数，用于获取随机索引模拟投票

        for (int i = 0; i < 80; i++) {
            //获得随机索引，根据随机索引获取4个景点存入集合中，模拟随机投票结果
            int index = random.nextInt(array.length);
            result.add(array[index]);
        }

        //2、创建Map集合，进行结果统计，键为景点名称，值为投票数
        HashMap<String, Integer> map = new HashMap<>();
        //3、遍历result集合，将投票结果遍历出来存入Map中
        for (String s : result) {
            //判断在Map中是否已经存在
            if (map.containsKey(s)) {
                //已存在
                int count = map.get(s);
                count++;
                map.put(s, count);
            } else {
                //不存在
                map.put(s, 1);
            }
        }
        System.out.println(map);


        //4、统计最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        System.out.println(max);
        //5、将最大值的景点名称打印出来
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey() + "是票数最多的，票数为：" + max);
            }
        }
    }
}

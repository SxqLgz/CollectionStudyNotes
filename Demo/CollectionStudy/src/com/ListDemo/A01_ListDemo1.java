package com.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {
        /**
         * List系列集合独有的方法:
         *         void add(int index,E element)在此集合中的指定位置插入指定的元素
         *         E remove(int index)          删除指定索引处的元素
         *         E set(int index,E element)   修改指定索引处的元素，返回被修改的元素
         *         E get(int index)             返回指定索引处的元素
         */
        List<String> list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);//A, B, C, D
        //按索引添加
        list.add(2,"3");
        System.out.println(list);//A, B, 3, C, D

        //按索引删除
        list.remove(2);
        System.out.println(list);//A, B, C, D
        /**
         * 删除注意事项
         * 如下：如果集合装的是整数类型元素，使用list.remove(1);删除的元素1还是索引1处的元素？
         * 答案是会把1认为是索引，优先按索引删除
         * 这是因为1是基本数据类型，没有包装成Integer引用数据类型
         * 在调用方法的时候，如果方法出现了重载现象，优先调用，实参跟形参类型一致的那个方法
         * 如果想要此处是直接按输入删除元素，而不是按索引，就需要进行一步包装
         */
        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.remove(1);

        Integer i = Integer.valueOf(1);//将基本数据类型包装为引用数据类型
        list1.remove(i);

        //按索引修改
        list.set(1,"1");
        System.out.println(list);//A, 1, C, D

        //返回指定索引处的元素
        String s = list.get(0);
        System.out.println(s);
    }
}

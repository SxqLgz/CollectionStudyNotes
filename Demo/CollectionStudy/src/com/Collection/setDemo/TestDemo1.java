package com.Collection.setDemo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestDemo1 {
    public static void main(String[] args) {
//        利用set集合添加字符串，并使用多种方法遍历
        Collection<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");
        set1.add("E");
        set1.add("F");

//        遍历
        for (String s : set1){
            System.out.println(s);
        }
//        迭代器遍历
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

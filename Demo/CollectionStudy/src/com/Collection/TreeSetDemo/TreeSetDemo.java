package com.Collection.TreeSetDemo;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //需求:利用TreeSet存储整数并进行排序
        //1、创建集合
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("wangwu",26);
        Student s3 = new Student("lisi",21);
        Student s4 = new Student("zhaoliu",24);
        //2、添加数据
        ts.add(s3);
        ts.add(s4);
        ts.add(s1);
        ts.add(s2);
        //3、打印输出
        System.out.println(ts);
    }
}

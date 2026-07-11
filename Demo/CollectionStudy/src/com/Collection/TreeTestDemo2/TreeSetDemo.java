package com.Collection.TreeTestDemo2;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //TreeSet练习题

        //1、创建集合，实现Comparator接口
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            /**
             * 按照总分从高到低输出到控制台
             * 如果总分一样，按照语文成绩排
             * 如果语文一样，按照数学成绩排
             * 如果数学成绩一样，按照英语成绩排
             * 如果英文成绩一样，按照年龄排
             * 如果年龄一样，按照姓名的字母顺序排
             * 如果都一样，认为是同一个学生，不存。
             */
            public int compare(Student o1, Student o2) {
                int scoreo1 = o1.getChineseScore() + o1.getEnglishScore() + o1.getMathScore();//o1总成绩
                int scoreo2 = o2.getChineseScore() + o2.getEnglishScore() + o2.getMathScore();//o2总成绩
                int i = scoreo1 - scoreo2;
                if (i == 0) {
                    return o1.compareTo(o2);
                } else {
                    return i;
                }
            }
        });
        //2、创建对象
        Student s1 = new Student("zhangsan", 23, 85, 45, 78);
        Student s2 = new Student("lisi", 21, 45, 65, 79);
        Student s3 = new Student("zhaoliu", 23, 97, 35, 78);
        Student s4 = new Student("wangwu", 23, 86, 76, 64);
        Student s5 = new Student("zhangsan", 23, 85, 45, 78);

        ts.add(s2);
        ts.add(s5);
        ts.add(s1);
        ts.add(s4);
        ts.add(s3);

        System.out.println(ts);

    }
}

package com.Collection.TreeSetDemo;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        /**
         * 使用实现comparator接口的方法来实现字符串按长度排序
         */
//        TreeSet<String> ts = new TreeSet(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int i = o1.length()-o2.length();
//                //比较字符串长度，如果长度相等，则使用默认的比较方法
//                if (i==0){
//                    i = o1.compareTo(o2);
//                    return i;
//                }else {
//                    return i;
//                }
//            }
//        });

        TreeSet<String> ts = new TreeSet<>((String o1, String o2)-> {
                int i = o1.length()-o2.length();
                //比较字符串长度，如果长度相等，则使用默认的比较方法
                if (i==0){
                    i = o1.compareTo(o2);
                    return i;
                }else {
                    return i;
                }
        });
        ts.add("aa");
        ts.add("b");
        ts.add("afaff");
        ts.add("sdf");
        System.out.println(ts);
    }
}

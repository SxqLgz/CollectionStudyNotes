package com.Collection.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class A01_ArrayListDemo2 {
    public static void main(String[] args) {
        /**
         * Collection系列集合三种通用的遍历方式
         *      1、迭代器遍历
         *      2、增强for循环
         *      3、Lambda表达式遍历
         */

        /**
         * 迭代器的三种方法
         *      Iterator<E> iterator():获取一个迭代器对象
         *      boolean hasNext():判断当前指向的位置是否有元素
         *      E next():获取当前指向的元素并移动指针
         */

        //1、创建一个集合并添加元素
        Collection<String> collection = new ArrayList<>();
        collection.add("AAA");
        collection.add("BBB");
        collection.add("CCC");
        collection.add("DDD");
        collection.add("EEE");

        //2、获取迭代器对象
        Iterator<String> iterator = collection.iterator();
        //3、利用循环遍历对象
            /**
             * 迭代器的细节注意点:
             * 1.报错NoSuchElementException.迭代器遍历完毕，指针不会复位，继续使用会报空元素异常，想再次使用只能重新创建Iterator
             * 2.循环中只能用一次next方法，所有next公用一个对象
             * 3.迭代器遍历时，不能用集合的方法进行增加或者删除，会出现并发异常，只能使用Iterator提供的方法删除
             * 4、hasNext和next配套使用
             */
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            //输出结果依次为AAA BBB CCC DDD EEE NoSuchElementException异常
            //所有next公用一个对象，如果要反复操作next获取的数据，就将数据使用变量接收 String next = iterator.next();
        }

        Iterator<String> iterator1 = collection.iterator();
        while (iterator1.hasNext()){
            String next = iterator.next();
            if ("BBB".equals(next)){
                //迭代器遍历时，不能用集合的方法进行增加或者删除，会出现并发异常
                //collection.remove("BBB");并发异常
                iterator.remove();
            }
        }

        /**2.利用匿名内部类的形式
         *  底层原理:
         *  其实也会自己遍历集合，依次得到每一个元素
         *  把得到的每一个元素，传递给下面的accept方法
         *  s依次表示集合中的每一个数据
         */
         //匿名内部类表示
            // collection.forEach(new Consumer<String>(){
            // @Override
            // public void accept(String s){
            //   System.out.println(s);
            // }});

        //简化为Lambda表达式
        collection.forEach(s -> System.out.println(s));
    }
}

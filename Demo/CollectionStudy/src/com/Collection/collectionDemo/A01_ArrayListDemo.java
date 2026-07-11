package com.Collection.collectionDemo;

import com.Collection.Bean.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class A01_ArrayListDemo {
    public static void main(String[] args) {
//==================================目标：学习Collection接口里的方法=================================================

/**     Collection是是单列集合的祖宗，它功能全部单列集合都能使用
 *      方法如下
 *
        public boolean add(E e)                 添加
        public void clear()                     清空
        public boolean remove(E e)              删除
        public boolean contains(Object obj)     判断是否包含
        public boolean isEmpty()                判断是否为空
        publi int size()                        获取集合长度

        注意点：Collection是一个接口，不能直接创建它的对象，所以在学习的时候，需要创建它的实现类
 **/
        //使用多态创建Collection的实现类ArrayList
        Collection<String> collection = new ArrayList();

        /**方法：添加元素
         * 细节一：如果往List集合中添加元素，由于List允许元素重复，所以永远返回ture
         * 细节二：如果往set集合中添加元素，由于set集合不允许元素重复，如果元素已经存在，会返回false
         */
        collection.add("zhangsan");
        collection.add("lisi");
        System.out.println(collection.add("wangwu"));
        System.out.println(collection);

        //方法：删除
        collection.remove("zhangsan");
        System.out.println(collection);

        //方法：判断是否包含
        boolean result1 = collection.contains("zhangsan");
        boolean result2 = collection.contains("lisi");
        System.out.println(result1);//false
        System.out.println(result2);//ture
        /**注意点：contain方法底层是通过遍历集合中所有的元素，使用equals方法比较进行的判断
         * 如果集合中添加的是自定义对象类，则必须在自定义类中重写equals方法，
         * 如下，在Preson对象类中并没有重写equals方法，所以即使判断的元素是一模一样的，contain方法依旧是返回的false
         * 因为如果自定义对象类不重写equals，那么默认使用的equals是继承自所有类的父类Object类中equals
         * 而Objcet类中的equals比较的不是元素内容，而是元素的地址，所以即使元素一样，也会判定为不一样，认为不包含该元素
         */
        Collection<Person> coll = new ArrayList<>();
        Person p1 = new Person("zhangsan",24);
        Person p2 = new Person("lisi",25);

        coll.add(p1);
        coll.add(p2);

        Person p3 = new Person("zhangsan",26);
        System.out.println(coll.contains(p3));//此处输出false，即使元素内容一模一样，如果此处重写了equals则输出ture

        //方法：判断是否为空
        System.out.println(collection.isEmpty());//false

        //方法：返回集合大小
        System.out.println(collection.size());//2

        //方法：清空
        collection.clear();
        System.out.println(collection);





    }
}

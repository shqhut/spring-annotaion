package com.shq.javase.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTest {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"张三"));
        list.add(new Student(4,"李四"));
        list.add(new Student(2,"王五"));

        //Comparator<T>函数式接口int compare(T o1, T o2);
        list.sort((t1, t2) -> {
            //根据id排序
            if (t1.getId() == t2.getId()) {
                return 0;
            }
            return t1.getId() > t2.getId() ? 1 : -1;
        });
        System.out.println(list);
        System.out.println(list);

        List<Order> list2 = new ArrayList<>();
        list2.add(new Order(1,"张三"));
        list2.add(new Order(4,"李四"));
        list2.add(new Order(2,"王五"));
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

    }
}


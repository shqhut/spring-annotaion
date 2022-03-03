package com.shq.test.javase.Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    static List<String> list = new ArrayList<>();

    static {
        for (int i=0; i<10; i++) {
            list.add("元素"+i);
        }
    }

    /**
     * 使用迭代器便利集合，迭代器允许调用者在迭代过程中移除元素
     */
    @Test
    public void testIterator(){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            iterator.remove();
        }
    }

    /**
     * 数组和List之间转换
     */
    @Test
    public void testArraysToList(){
        String[] strings = new String[]{"123","456"};
        //数组转List：使用
        List<String> stringList = Arrays.asList(strings);
        for (String e : stringList) {
            System.out.println(e);
        }

        //List转数组：使用List自带的toArray()
        Object[] stringsList = list.toArray();
        for (int i=0; i<stringsList.length; i++){
            System.out.println(stringsList[i]);
        }
    }

    @Test
    public void testMoveBit(){
        int a = 8;
        int b = a >>> 2;
        int c = a << 2;
        System.out.println(b);
        System.out.println(c);
    }



}

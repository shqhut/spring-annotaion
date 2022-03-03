package com.shq.jvm;

import com.sun.crypto.provider.DESKeyFactory;

public class TestJDKClassLoader {

    public static void main(String[] args) {
        //启动类加载器是C++语言实现，所以打印不出来
        System.out.println(String.class.getClassLoader());
        System.out.println(DESKeyFactory.class.getClassLoader().getClass().getName());
        System.out.println(TestJDKClassLoader.class.getClassLoader().getClass().getName());
        System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());
    }
}

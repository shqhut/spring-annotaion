package com.shq.javase;

public class EqualsTest {

    public static void main(String[] args) {
        String a = new String("ab");
        String b = new String("ab");
        String aa = "ab"; //放在常量池中
        String bb = "ab"; //从常量池中查找
        if (aa == bb){
            System.out.println("aa == bb");
        }
        if (a == b){
            System.out.println("a == b");
        }
        if (a.equals(b)){
            System.out.println("aEQb");
        }
        if (42 == 42.0){
            System.out.println("42 == 42.0");
        }
        EqualsTest equalsTest = new EqualsTest();
        System.out.println(equalsTest.hashCode());
    }
}

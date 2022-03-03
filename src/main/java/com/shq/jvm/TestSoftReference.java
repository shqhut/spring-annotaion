package com.shq.jvm;

import java.lang.ref.SoftReference;

public class TestSoftReference {

    public static void main(String[] args) {
        SoftReference<Byte[]> softReference = new SoftReference<>(new Byte[1024*1024*10]);
    }
}

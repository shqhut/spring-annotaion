package com.shq.jmm;

import org.openjdk.jol.info.ClassLayout;

public class SynchronizedLockLevelUpDemo {

    public static void main(String[] args) {
        byte[] bytes = new byte[1024*1024];
        System.out.println(ClassLayout.parseInstance(bytes).toPrintable());
    }
}

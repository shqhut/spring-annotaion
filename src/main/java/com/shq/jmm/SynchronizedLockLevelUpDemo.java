package com.shq.jmm;

import org.openjdk.jol.info.ClassLayout;

public class SynchronizedLockLevelUpDemo {

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}

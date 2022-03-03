package com.shq.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsTest {

    public static void main(String[] args) {
//        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
//        for (int i = 1; i < 10; i++) {
//            singleThreadExecutor.execute(new MyRunnable(""+i));
//        }

        //指定一个
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        for (int i = 1; i < 20; i++) {
            fixedThreadPool.execute(new MyRunnable(""+i));
        }
        fixedThreadPool.shutdown();
    }
}

package com.shq.jvm;

/**
 * -Xss设置越小，说明一个线程栈中能分配的栈帧就越少，但对JVM整体来说能开启的线程数会更多。
 */
public class StackOverflowTest {

    static int count = 0;

    public void redo(){
        count++;
        redo();
    }

    public static void main(String[] args) {
        StackOverflowTest stackOverflowTest = new StackOverflowTest();
        try {
            stackOverflowTest.redo();
        } catch (Error exception) {
            exception.printStackTrace();
            System.out.println(count);
        }
    }
}

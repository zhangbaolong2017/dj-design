package com.bj58.daojia.thread;

/**
 * Created by 58 on 2016-11-23.
 */
public class MyThreadTest {
    public static void main(String[] args) throws Exception{
        Thread temp1 = new MyThread("asdddd");
        Thread temp2 = new MyThread("as222");

        temp1.run();
        temp2.run();
        System.out.println(temp1.getId());
        System.out.println(temp1.getPriority());
        System.out.println(temp2.getId());
        System.out.println(temp2.getPriority());
        MyRunnable temp3 = new MyRunnable("ssss");
        temp3.run();
    }
}

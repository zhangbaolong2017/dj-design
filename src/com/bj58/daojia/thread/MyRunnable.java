package com.bj58.daojia.thread;

/**
 * Created by 58 on 2016-11-23.
 */
public class MyRunnable implements Runnable{
    public static String name = "asd";

    public MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("MyThread.run()"+name);
    }
}

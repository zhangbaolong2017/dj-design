package com.bj58.daojia.thread;

/**
 * Created by 58 on 2016-11-23.
 */
public class MyThread extends Thread {
    public static String name = "asd";

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        Integer i =1;
        while (i<10000){
            i++;
            System.out.println("MyThread.run()"+name+i);
        }
    }
}

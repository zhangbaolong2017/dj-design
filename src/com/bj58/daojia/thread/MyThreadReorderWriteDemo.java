package com.bj58.daojia.thread;

/**
 * Created by 58 on 2016-11-23.
 */
public class MyThreadReorderWriteDemo extends Thread {
    public static String name = "asd";
    public static ReorderExample reorderExample = new ReorderExample();

    public MyThreadReorderWriteDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        reorderExample.writer();
    }
}

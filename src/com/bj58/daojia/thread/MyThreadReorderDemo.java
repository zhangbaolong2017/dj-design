package com.bj58.daojia.thread;

/**
 * Created by 58 on 2016-11-23.
 */
public class MyThreadReorderDemo extends Thread {
    public static String name = "asd";
    public static ReorderExample reorderExample = new ReorderExample();

    public MyThreadReorderDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        //重排序后，未能按顺序正常执行
        reorderExample.reader();
        reorderExample.writer();
    }
}

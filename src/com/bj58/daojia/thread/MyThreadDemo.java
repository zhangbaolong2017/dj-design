package com.bj58.daojia.thread;

/**
 * Created by 58 on 2016-11-23.
 */
public class MyThreadDemo {
    public static void main(String[] args) throws Exception{
        MyThreadReorderDemo sd = new MyThreadReorderDemo("read");
        //MyThreadReorderWriteDemo writeDemo = new MyThreadReorderWriteDemo("write");
        for(int j=0;j<10000;j++){
            sd.run();
        }

       // writeDemo.run();

    }
}

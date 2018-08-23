package com.bj58.daojia.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 58 on 2016-11-23.
 */
public class ExecuterTest {
    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++){
            service.execute(new MyThread("www"));
            service.shutdown();
        }
    }
}

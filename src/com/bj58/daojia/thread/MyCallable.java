package com.bj58.daojia.thread;

import java.util.concurrent.Callable;

/**
 * Created by 58 on 2016-11-23.
 */
public class MyCallable implements Callable<String>{
    public static String name = "asd";

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        String result = "";
        result = name;
        return result;
    }
}

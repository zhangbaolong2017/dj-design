package com.bj58.daojia.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by 58 on 2016-11-23.
 */
public class CallableTest {
    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(5);
        List<Future<String>> futureList = new ArrayList<Future<String>>();
        for(int i=0;i<5;i++){
            futureList.add(service.submit(new MyCallable("asd" + i)));
            for(Future<String> result:futureList){
                System.out.println(result.get());
            }
        }
    }
}

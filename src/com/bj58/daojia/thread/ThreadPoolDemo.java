package com.bj58.daojia.thread;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        Integer count = 10;
        long startTime = System.currentTimeMillis();
        final List<Integer> l = new LinkedList<Integer>();
        ThreadPoolExecutor tp = new ThreadPoolExecutor(1, 1, 60,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(count));
        final Random random = new Random();
        for (int i = 0; i < count; i++) {
            tp.execute(new Runnable() {
                @Override
                public void run() {
                    l.add(random.nextInt());
                }
            });
        }
        tp.shutdown();
        try{
            tp.awaitTermination(1,TimeUnit.DAYS);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println(l.size());
    }
}

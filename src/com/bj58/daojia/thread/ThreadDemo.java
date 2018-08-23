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
public class ThreadDemo {
    public static void main(String[] args) {
        Integer count = 10;
        long startTime = System.currentTimeMillis();
        final List<Integer> l = new LinkedList<Integer>();
        final Random random = new Random();
        for (int i = 0; i < count; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    l.add(random.nextInt());
                }
            };
            thread.start();
            try{
                thread.join();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println(l.size());
    }
}

package com.bj58.daojia.volatiledemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class VolatileFeaturesExample {
    volatile long v1 = 0L;

    public void setV1(long l) {
        v1 = l;
    }
    public  void getAndIncrementV1(){
        v1++;
    }
    public  long getV1(){
        return v1;
    }

    public static void main(String[] args) {
        Integer count = 5;
        VolatileFeaturesExample demo = new VolatileFeaturesExample();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(count);
        fixedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                long temp = demo.getV1();
                System.out.println("第一次："+temp);
            }
        });

        fixedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                demo.setV1(10);
            }
        });
        fixedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                long temp = demo.getV1();
                System.out.println("第二次："+temp);
            }
        });

        fixedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                demo.getAndIncrementV1();
            }
        });
        fixedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                long temp = demo.getV1();
                System.out.println("第三次："+temp);
            }
        });

    }
}

package com.bj58.daojia.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class Counter {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private int i = 0;

    /**
     * 非线程安全
     */
    private void count(){
        i++;
    }

    /**
     * 使用cas实现线程安全
     */
    private void safecount(){
        for(;;){
            int i = atomicInteger.get();
            boolean success = atomicInteger.compareAndSet(i,++i);
            if(success){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        final Counter cas = new Counter();
        List<Thread> ts = new ArrayList<Thread>(600);
        for(int j=0;j<100;j++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0;i<10000;i++){
                        cas.safecount();
                    }
                }
            });
            ts.add(t);
        }
        for(Thread t:ts){
            t.start();
        }
        for(Thread t:ts){
            try{
                t.join();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(cas.i);
        System.out.println(cas.atomicInteger.get());
        System.out.println(System.currentTimeMillis()-start);
    }
}

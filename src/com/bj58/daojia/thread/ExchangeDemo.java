package com.bj58.daojia.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class ExchangeDemo {
    public static void main(String[] args) {
        final Exchanger<List<Integer>> exchanger = new Exchanger<List<Integer>>();
        new Thread(){
            @Override
            public void run(){
                List<Integer> l=new ArrayList<Integer>(2);
                l.add(1);
                l.add(2);
                try{
                    l = exchanger.exchange(l);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("Thread1"+l);
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                List<Integer> l=new ArrayList<Integer>(2);
                l.add(3);
                l.add(4);
                try{
                    l = exchanger.exchange(l);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("Thread2"+l);
            }
        }.start();
    }
}

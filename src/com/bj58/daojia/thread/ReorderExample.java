package com.bj58.daojia.thread;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class ReorderExample {
    int a = 0;
    boolean flag = false;

    public synchronized void reader() {
        a = 1;
        flag = true;
        //System.out.println("a:"+a+",flag:"+flag);
    }

    public synchronized  void writer(){
        if(flag){
            int i = a*a;
            System.out.println("i:"+i);
        }else {
            System.out.println("chongpaixu");
        }
    }


}

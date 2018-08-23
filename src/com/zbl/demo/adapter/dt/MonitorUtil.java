package com.zbl.demo.adapter.dt;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class MonitorUtil {

    private static ThreadLocal<Long> haoshi = new ThreadLocal<Long>();
    public static void start() {
        Long startDate = System.currentTimeMillis();
        haoshi.set(startDate);

    }

    public static void finish(){
        Long endDate = System.currentTimeMillis();
        System.out.println(endDate-haoshi.get());

    }
}

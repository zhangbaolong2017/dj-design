package com.zbl.demo.adapter;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("method22222");
    }

    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    }
}

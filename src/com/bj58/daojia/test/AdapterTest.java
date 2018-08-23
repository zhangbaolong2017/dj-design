package com.bj58.daojia.test;

import com.bj58.daojia.adapter.Targetable;
import com.bj58.daojia.adapter.impl.Adapter;

/**
 * Created by 58 on 2015-10-16.
 */
public class AdapterTest {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Targetable s=new Adapter();
        s.method1();
        s.method2();
    }
}

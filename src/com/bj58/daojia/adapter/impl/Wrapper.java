package com.bj58.daojia.adapter.impl;

import com.bj58.daojia.adapter.Source;
import com.bj58.daojia.adapter.Targetable;

/**
 * Created by 58 on 2015-10-16.
 */
public class Wrapper implements Targetable {
    private Source source;
    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}

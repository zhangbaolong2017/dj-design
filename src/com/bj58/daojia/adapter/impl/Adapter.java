package com.bj58.daojia.adapter.impl;

import com.bj58.daojia.adapter.Source;
import com.bj58.daojia.adapter.Targetable;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by 58 on 2015-10-16.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("22222222222222");
    }
}

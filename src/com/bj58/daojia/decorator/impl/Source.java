package com.bj58.daojia.decorator.impl;

import com.bj58.daojia.decorator.Sourceable;

/**
 * Created by 58 on 2015-10-16.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}

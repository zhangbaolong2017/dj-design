package com.bj58.daojia.decorator.impl;

import com.bj58.daojia.adapter.*;
import com.bj58.daojia.decorator.Sourceable;

/**
 * Created by 58 on 2015-10-16.
 */
public class Decorator implements Sourceable {
    private Sourceable source;
    public Decorator(Sourceable source){
        super();
        this.source=source;
    }

    @Override
    public void method() {
        System.out.println("1111111");
        source.method();
        System.out.println("2222222");
    }
}

package com.zbl.demo.decorator.impl;

import com.zbl.demo.decorator.Sourceable;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("method run before");
        source.method();
        System.out.println("method run after");
    }
}

package com.zbl.demo.adapter;

import java.util.HashMap;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        HashMap hhh=new HashMap();
        System.out.println("adapter method2");

    }
}

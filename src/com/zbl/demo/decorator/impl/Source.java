package com.zbl.demo.decorator.impl;

import com.zbl.demo.decorator.Sourceable;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}

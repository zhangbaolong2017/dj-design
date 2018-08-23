package com.zbl.demo.adapter.dtdemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class StuInvokeHandler<T> implements InvocationHandler {
    T target;

    public StuInvokeHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("tonguodaile");
        Object result = method.invoke(target,args);
        return result;
    }
}

package com.zbl.demo.adapter.dt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class StuInvocationHandler<T> implements InvocationHandler {
    //invocationHandler持有被代理对象
    T target;

    public StuInvocationHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("通过代理类执行"+method.getName());
        MonitorUtil.start();
        //真正执行类中方法
        Object result = method.invoke(target,args);
        MonitorUtil.finish();
        return result;
    }
}

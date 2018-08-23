package com.zbl.demo.adapter.dtdemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class ProxyTest {
    public static void main(String[] args) {
        Person stu = new Student("sd");
        InvocationHandler invocationHandler = new StuInvokeHandler<Person>(stu);
        Person proxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),new Class<?>[]{Person.class},invocationHandler);
        proxy.giveMoney();

    }
}

package com.zbl.demo.adapter.dt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class Proxytest {
    public static void main(String[] args) {
        Person stu = new Student("上班");
        //
        InvocationHandler stuHandler = new StuInvocationHandler<Person>(stu);

        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class<?>[]{Person.class}, stuHandler);
        stuProxy.giveMoney();
    }
}

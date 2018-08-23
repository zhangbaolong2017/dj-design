package com.zbl.demo.adapter.dtdemo;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class Student implements Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name){
        this.name = name;
    }
    @Override
    public void giveMoney() {
        System.out.println("jiaofei");

    }
}

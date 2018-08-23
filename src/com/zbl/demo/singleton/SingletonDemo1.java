package com.zbl.demo.singleton;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class SingletonDemo1 {
    private  static SingletonDemo1 instance = null;

    private  SingletonDemo1(){

    }
    public  static SingletonDemo1 getInstance(){
        if(instance == null){
            instance = new SingletonDemo1();
        }
        return  instance;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     * @return
     */
    public  Object readResolve(){
        return  instance;
    }
}

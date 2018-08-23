package com.zbl.demo.singleton;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class SingletonDemo2 {
    /**
     * 私有化构造方法，防止被实例化
     */
    private SingletonDemo2() {
    }

    /**
     * 静态内部类
     */
    private  static  class SingletonFactory{
        private  static SingletonDemo2 instance = new SingletonDemo2();
    }
    public  static SingletonDemo2 getInstance(){
        return  SingletonFactory.instance;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在被序列化铅华保持一致
     * @return
     */
    public  Object readResolve(){
        return getInstance();
    }
}

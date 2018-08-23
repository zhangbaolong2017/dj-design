package com.zbl.demo.singleton;

import java.util.Vector;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class SingletonDemo3 {
    private static SingletonDemo3 instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }


    /**
     * 私有化构造方法，防止被实例化
     */
    private SingletonDemo3() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonDemo3();
        }

    }

    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties(){
        SingletonDemo3 shadow = new SingletonDemo3();
        properties = shadow.getProperties();
    }
}

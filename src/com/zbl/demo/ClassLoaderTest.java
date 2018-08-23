package com.zbl.demo;

import java.util.LinkedHashMap;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader loader = ClassLoaderTest.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader.toString());
            loader = loader.getParent();
        }
        //ExtClassLoader父类在加载时被赋值为null,所以只能打印两个

        LinkedHashMap linkedHashMap=null;
        System.out.println(System.class.getClassLoader());
    }

}

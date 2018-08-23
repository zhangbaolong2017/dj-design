package com.zbl.demo.build;

/**
 * @author:Zhangbaolong
 * @description:代理
 * @date: create in ${Time} ${Date}
 */
public class Director {
    public void Construct(Builder builder){

        builder.BuildCPU();
        builder.BuildMainboard();
        builder.BuildHD();
    }
}

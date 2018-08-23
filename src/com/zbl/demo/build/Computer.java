package com.zbl.demo.build;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class Computer {
    private List<String> parts = new ArrayList<>();
    public  void add(String part){
        parts.add(part);
    }
    public void show(){
        for(int i=0;i<parts.size();i++){
            System.out.println("组件"+parts.get(i)+"装好了");
        }
        System.out.println("电脑组装完成");
    }
}

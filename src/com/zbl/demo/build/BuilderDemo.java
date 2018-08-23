package com.zbl.demo.build;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.Construct(builder);
        Computer computer = builder.getComputer();
        computer.show();
    }
}

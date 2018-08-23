package com.zbl.demo.build;



/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class ConcreteBuilder extends Builder {
    Computer computer = new Computer();
    @Override
    public void BuildCPU() {
        computer.add("cpu");
    }

    @Override
    public void BuildMainboard() {
        computer.add("Mainboard");

    }

    @Override
    public void BuildHD() {
        computer.add("HD");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

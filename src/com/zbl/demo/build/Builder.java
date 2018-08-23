package com.zbl.demo.build;



/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public abstract class Builder {
    public abstract void BuildCPU();
    public abstract void BuildMainboard();
    public abstract void BuildHD();
    public abstract Computer getComputer();
}

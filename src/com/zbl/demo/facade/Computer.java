package com.zbl.demo.facade;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class Computer {

    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer(){
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void startup(){
        cpu.startup();
        disk.startup();
        memory.startup();
    }

    public void shutdown(){
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
    }

}

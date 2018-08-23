package com.zbl.demo.command.impl;

import com.zbl.demo.command.Command;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class CommandDemo implements Command {
    private Receiver receiver;

    public CommandDemo(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        System.out.println("CommandDemo exec!!!");
        receiver.action();
    }
}

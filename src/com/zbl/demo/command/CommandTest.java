package com.zbl.demo.command;

import com.zbl.demo.command.impl.CommandDemo;
import com.zbl.demo.command.impl.Invoker;
import com.zbl.demo.command.impl.Receiver;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class CommandTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new CommandDemo(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}

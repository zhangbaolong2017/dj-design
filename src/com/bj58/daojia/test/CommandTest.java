package com.bj58.daojia.test;

import com.bj58.daojia.command.Command;
import com.bj58.daojia.command.entity.Invoker;
import com.bj58.daojia.command.entity.Receiver;
import com.bj58.daojia.command.impl.MyCommand;

/**
 * Created by 58 on 2015-10-19.
 */
public class CommandTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker=new Invoker(cmd);
        invoker.action();
    }
}

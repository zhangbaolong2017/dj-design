package com.bj58.daojia.command.impl;

import com.bj58.daojia.command.Command;
import com.bj58.daojia.command.entity.Receiver;

/**
 * Created by 58 on 2015-10-19.
 */
public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand( Receiver receiver){
        this.receiver=receiver;
    }
    @Override
    public void exe() {
        receiver.action();
    }
}

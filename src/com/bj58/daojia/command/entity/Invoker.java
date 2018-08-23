package com.bj58.daojia.command.entity;

import com.bj58.daojia.command.Command;

/**
 * Created by 58 on 2015-10-19.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command=command;
    }

    public void action(){
        command.exe();
    }
}

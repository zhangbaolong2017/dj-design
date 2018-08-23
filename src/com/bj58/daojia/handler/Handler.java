package com.bj58.daojia.handler;

/**
 * Created by Administrator on 2017/6/15.
 */
public abstract  class Handler {
    private Handler nextHandler;
    public Handler getNextHandler() {
        return nextHandler;
    }
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void doHandler();
}

package com.bj58.daojia.handler;

/**
 * Created by Administrator on 2017/6/15.
 */
public class HandlerTest {
    public static void main(String[] args) {
        ConcreteHandler ds= new ConcreteHandler();
        ds.setNextHandler(new ConcreteHandler());
        ds.doHandler();
    }
}

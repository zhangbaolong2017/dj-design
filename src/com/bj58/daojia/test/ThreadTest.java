package com.bj58.daojia.test;

import javax.xml.ws.Holder;

/**
 * Created by 58 on 2015-10-16.
 */
public class ThreadTest {
    public static Holder holder;

    public static void initialize(){
        holder = new Holder(42);
    }

    public static void main(String[] args) {
        initialize();
    }
}

package com.zbl.demo.factory;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class FactoryDemo {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produce("mail");
        sender.send("cnm");
    }
}

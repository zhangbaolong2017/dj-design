package com.zbl.demo.factory.impl;

import com.zbl.demo.factory.Sender;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class MailSender implements Sender {
    @Override
    public void send(String msgContent) {
        System.out.println(msgContent+" come from mailSender");
    }
}

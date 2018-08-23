package com.bj58.daojia.rpc.service.impl;

import com.bj58.daojia.rpc.service.EchoService;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String ping) {
        return ping != null ? ping + "-->I am ok." : "I am ok.";
    }
}

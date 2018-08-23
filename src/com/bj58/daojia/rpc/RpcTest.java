package com.bj58.daojia.rpc;

import com.bj58.daojia.rpc.exporter.RpcExporter;
import com.bj58.daojia.rpc.importer.RpcImporter;
import com.bj58.daojia.rpc.service.EchoService;
import com.bj58.daojia.rpc.service.impl.EchoServiceImpl;

import java.net.InetSocketAddress;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class RpcTest {
    public static void main(String[] args) throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    RpcExporter.exporter("127.0.0.1", 8088);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        RpcImporter<EchoService> importer = new RpcImporter<EchoService>();
        EchoService echo = importer.importer(EchoServiceImpl.class, new InetSocketAddress("127.0.0.1", 8088));
        System.out.println(echo.echo("Are you OK?"));

    }
}

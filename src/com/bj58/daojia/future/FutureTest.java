package com.bj58.daojia.future;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class FutureTest {
    final static ExecutorService executor = Executors.newFixedThreadPool(2);

    static class RpcService implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println("rpc调用");
            return null;
        }
    }

    static class HttpService implements Callable<String>{
        @Override
        public String call() throws Exception {
            System.out.println("http调用");
            return null;
        }
    }

    public static void main(String[] args) {
        RpcService rpcService = new RpcService();
        HttpService httpService = new HttpService();
        Future<String> future1 = null;
        Future<String> future2 = null;
        try {
            future1 = executor.submit(rpcService);
            future2 = executor.submit(httpService);
        } catch (Exception e) {

        }

    }

}

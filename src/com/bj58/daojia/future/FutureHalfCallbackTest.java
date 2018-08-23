package com.bj58.daojia.future;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.nio.client.HttpAsyncClient;

import java.util.concurrent.CompletableFuture;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class FutureHalfCallbackTest {
    public static HttpAsyncClient httpAsyncClient;
    public static CompletableFuture<String> getHttpData(String url){
        CompletableFuture asyncFuture =  new CompletableFuture();
        return null;
    }

    public static void main(String[] args) {
        HttpPost httpHost = new HttpPost("http://www.jd.com");
        Header[] headers = httpHost.getAllHeaders();
        for(Header header:headers){
            System.out.println(header.getName());
        }
    }

}

package com.bj58.daojia.test;

/**
 * Created by Administrator on 2017/6/7.
 */
public class RefTest {
    public static final int DATA_LEN = 10;
    private final byte[] data = new byte[DATA_LEN];

    public RefTest() {

    }

    public byte[] getData() {
        return data;
    }

    public static void main(String[] argv) {
        RefTest test = new RefTest();
        byte[] data = test.getData();
        System.out.println(data[0]);
        data[0] = 10;
        byte[] data2 = test.getData();
        System.out.println(data2[0]);
    }
}

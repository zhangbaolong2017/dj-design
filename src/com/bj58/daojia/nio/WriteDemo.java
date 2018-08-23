package com.bj58.daojia.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by 58 on 2016-11-28.
 */
public class WriteDemo {
    static private final byte message[] = {83, 111, 109, 101, 32,
            98, 121, 116, 101, 115, 46};

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("D:\\test.txt");
            FileChannel fc = fileOutputStream.getChannel();
            // 创建缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            //读取数据到缓冲区
            for (int i = 0; i < message.length; ++i) {
                buffer.put(message[i]);
            }
            buffer.flip();
            fc.write(buffer);
        } catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}

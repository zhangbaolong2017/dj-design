package com.bj58.daojia.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

/**
 * Created by 58 on 2016-11-28.
 */
public class ReadDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\test.txt");
            FileChannel fc = fileInputStream.getChannel();
            // 创建缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            //读取数据到缓冲区
            fc.read(buffer);
            //将limit设为当前最大值，读取位置设为开始
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getStackTrace());
        }finally {
            if(fileInputStream!=null){
                fileInputStream.close();
            }
        }
    }
}

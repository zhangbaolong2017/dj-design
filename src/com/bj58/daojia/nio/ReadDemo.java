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
            // ����������
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            //��ȡ���ݵ�������
            fc.read(buffer);
            //��limit��Ϊ��ǰ���ֵ����ȡλ����Ϊ��ʼ
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

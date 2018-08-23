package com.bj58.daojia.syn;

/**
 * Created by Administrator on 2017/5/27.
 */
public class VolatileDemo implements Runnable {

    // volatile设置可见性
    private volatile int count = 0;

    public int getValue() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
            count++;
        }
    }

    public static void main(String[] args) {
        VolatileDemo at = new VolatileDemo();
        new Thread(at).start();
        while (true) {
            int val = at.getValue();
            // 出现的数，奇数偶数不定
            if (val % 2 != 0) {
                System.out.println(val + " is not even!");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

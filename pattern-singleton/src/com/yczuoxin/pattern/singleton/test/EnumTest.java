package com.yczuoxin.pattern.singleton.test;

import com.yczuoxin.pattern.singleton.enums.ColorEnum;

import java.util.concurrent.CountDownLatch;

public class EnumTest {
    public static void main(String[] args) {
        int count = 1000;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread(()->{
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("aaa " + ColorEnum.RED);
            }).start();
            latch.countDown();
            System.out.println(latch.getCount());
        }

    }
}

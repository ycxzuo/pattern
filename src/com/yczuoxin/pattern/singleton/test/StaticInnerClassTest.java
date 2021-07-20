package com.yczuoxin.pattern.singleton.test;

import com.yczuoxin.pattern.singleton.statics.StaticInnerClass;

import java.util.concurrent.CountDownLatch;

/**
 * @program: pattern
 * @description: 静态内部类的测试用例
 * @author: yczuoxin
 * @create: 2018-08-04 11:01
 **/
public class StaticInnerClassTest {
    public static void main(String[] args) {
        int count = 1000;
        CountDownLatch latch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread(()->{
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(StaticInnerClass.getInstance());
            }).start();
            latch.countDown();
        }
        System.out.println("cost:" + (System.currentTimeMillis() - start) + "ms");
    }
}

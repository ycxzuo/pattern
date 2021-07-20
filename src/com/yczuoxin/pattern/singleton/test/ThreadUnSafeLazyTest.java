package com.yczuoxin.pattern.singleton.test;

import com.yczuoxin.pattern.singleton.lazy.ThreadUnSafeLazy;

import java.util.concurrent.CountDownLatch;

/**
 * @program: pattern
 * @description: 线程不安全的懒汉式测试用例
 * @author: yczuoxin
 * @create: 2018-08-04 10:15
 **/
public class ThreadUnSafeLazyTest {
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
                System.out.println(ThreadUnSafeLazy.getInstance());
            }).start();
            latch.countDown();
        }
        System.out.println("cost:" + (System.currentTimeMillis() - start) + "ms");
    }
}

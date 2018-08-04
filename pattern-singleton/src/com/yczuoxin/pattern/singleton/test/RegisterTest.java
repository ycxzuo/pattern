package com.yczuoxin.pattern.singleton.test;

import com.yczuoxin.pattern.singleton.register.Register;

import java.util.concurrent.CountDownLatch;

/**
 * @program: pattern
 * @description: 注册式单例容器的测试用例
 * @author: yczuoxin
 * @create: 2018-08-04 11:36
 **/
public class RegisterTest {
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
                System.out.println(Register.getInstance("com.yczuoxin.pattern.singleton.register.Register"));
            }).start();
            latch.countDown();
        }
        System.out.println("cost:" + (System.currentTimeMillis() - start) + "ms");
    }
}

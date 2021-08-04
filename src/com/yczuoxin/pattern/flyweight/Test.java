package com.yczuoxin.pattern.flyweight;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        CacheUtil cacheUtil = new CacheUtil();
        for (int i = 0; i < 10; i++) {
            System.out.println(cacheUtil.getStock());
            Thread.sleep(1200L);
        }
    }
}

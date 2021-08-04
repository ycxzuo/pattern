package com.yczuoxin.pattern.flyweight;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 缓存其实也是一种享元，就是在高并发情况下把热点数据放在缓存里面，而这个缓存就是享元的一种
 */
public class CacheUtil {

    private final AtomicInteger stock = new AtomicInteger(0);

    public CacheUtil() {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(() -> stock.addAndGet(1), 0, 100, TimeUnit.MILLISECONDS);
    }

    public int getStock() {
        return stock.get();
    }
}

package com.yczuoxin.pattern.mediator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WorkMediator extends Mediator {

    private final Map<String, Worker> workers = new ConcurrentHashMap<>();

    @Override
    public void register(String name, Worker worker) {
        workers.put(name, worker);
    }

    @Override
    public void work(String name) {
        Worker worker = workers.get(name);
        if (worker != null) {
            worker.doWork();
        }
    }
}

package com.yczuoxin.pattern.mediator;

public abstract class Mediator {

    public abstract void register(String name, Worker worker);

    public abstract void work(String name);

}

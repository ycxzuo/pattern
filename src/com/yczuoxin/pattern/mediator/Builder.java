package com.yczuoxin.pattern.mediator;

public class Builder extends Worker {

    private final Mediator mediator;

    public Builder(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void doWork() {
        System.out.println("建筑工人建造房子");
    }

    @Override
    public void doHelp(String name) {
        mediator.work(name);
    }
}

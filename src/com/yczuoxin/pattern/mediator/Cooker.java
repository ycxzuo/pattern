package com.yczuoxin.pattern.mediator;

public class Cooker extends Worker {
    private final Mediator mediator;

    public Cooker(Mediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public void doWork() {
        System.out.println("厨师烹饪");
    }

    @Override
    public void doHelp(String name) {
        mediator.work(name);
    }


}

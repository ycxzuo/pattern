package com.yczuoxin.pattern.mediator;

public class MediatorTest {

    public static void main(String[] args) {
        Mediator mediator = new WorkMediator();
        Worker cooker = new Cooker(mediator);
        Worker builder = new Builder(mediator);
        mediator.register("builder", builder);
        mediator.register("cooker", cooker);

        cooker.doHelp("builder");
        builder.doHelp("cooker");
    }

}

package com.yczuoxin.pattern.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        Pay pay = new Pay();
        pay.setId(1L);
        pay.setName("小小酥");
        pay.setMoney(2.0d);

        PayEventPublisher publisher = new PayEventPublisher();
        publisher.registerListener(new PayLogListener());
        publisher.registerListener(new PayMessageListener());

        publisher.doPay(new PayEvent(pay, System.currentTimeMillis()));
    }

}

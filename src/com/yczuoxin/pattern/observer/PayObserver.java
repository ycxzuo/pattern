package com.yczuoxin.pattern.observer;

public interface PayObserver {

    void whenPay(PayEvent event, long time);

}

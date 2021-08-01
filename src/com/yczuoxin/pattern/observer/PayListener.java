package com.yczuoxin.pattern.observer;

import java.util.EventListener;

public interface PayListener extends EventListener {

    void whenPay(PayEvent event, long time);

}

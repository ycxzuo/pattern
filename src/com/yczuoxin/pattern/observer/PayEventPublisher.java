package com.yczuoxin.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class PayEventPublisher {
    private final List<PayListener> listeners = new ArrayList<>();

    public void registerListener(PayListener listener) {
        listeners.add(listener);
    }

    public void registerListener(PayListener listener, int index) {
        listeners.add(index, listener);
    }

    public void doPay(PayEvent event) {
        for (PayListener listener : listeners) {
            listener.whenPay(event, event.getHappenedTime());
        }
    }
}

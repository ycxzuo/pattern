package com.yczuoxin.pattern.observer;

import java.util.EventObject;

public class PayEvent extends EventObject {

    private final long happenedTime;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public PayEvent(Pay source, long happenedTime) {
        super(source);
        this.happenedTime = happenedTime;
    }

    public long getHappenedTime() {
        return happenedTime;
    }
}

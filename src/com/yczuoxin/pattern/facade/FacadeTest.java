package com.yczuoxin.pattern.facade;

import com.yczuoxin.pattern.facade.facade.Platform;
import com.yczuoxin.pattern.facade.outer.Consumer;

public class FacadeTest {

    public static void main(String[] args) {
        Platform platform = new Platform();
        Consumer consumer = new Consumer();
        consumer.buy(platform);
    }
}

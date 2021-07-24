package com.yczuoxin.pattern.facade.outer;

import com.yczuoxin.pattern.facade.facade.Platform;

/**
 * 顾客
 */
public class Consumer {

    public void buy(Platform platform) {
        platform.order();
    }

}

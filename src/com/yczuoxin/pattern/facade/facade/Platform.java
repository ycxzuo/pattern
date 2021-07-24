package com.yczuoxin.pattern.facade.facade;

import com.yczuoxin.pattern.facade.inner.Rider;
import com.yczuoxin.pattern.facade.inner.Shopkeeper;

/**
 * 外卖平台
 */
public class Platform {

    private final Rider rider = new Rider();

    private final Shopkeeper shopkeeper = new Shopkeeper();

    public void order() {
        shopkeeper.make();
        rider.send();
    }

}

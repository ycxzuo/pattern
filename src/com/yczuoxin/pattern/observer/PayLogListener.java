package com.yczuoxin.pattern.observer;

import java.util.Date;

public class PayLogListener implements PayListener {
    @Override
    public void whenPay(PayEvent event, long time) {
        System.out.println("在 " + new Date(time) + " 的时候支付了订单");
    }
}

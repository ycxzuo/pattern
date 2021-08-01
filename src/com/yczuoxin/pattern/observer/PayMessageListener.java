package com.yczuoxin.pattern.observer;

public class PayMessageListener implements PayListener {
    @Override
    public void whenPay(PayEvent event, long time) {
        System.out.println("已成功支付订单：" + event.toString());
    }
}

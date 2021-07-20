package com.yczuoxin.pattern.strategy.pay;

public class WeChatPay extends Pay {
    @Override
    public void pay(double amount) {
        System.out.println("微信支付" + amount + "元");
    }
}

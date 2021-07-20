package com.yczuoxin.pattern.strategy.pay;

public class ALiPay extends Pay {

    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}

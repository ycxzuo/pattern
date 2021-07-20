package com.yczuoxin.pattern.strategy.pay;

public class PayCardPay extends Pay {
    @Override
    public void pay() {
        System.out.println("银行卡支付");
    }
}

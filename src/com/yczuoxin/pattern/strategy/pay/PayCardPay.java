package com.yczuoxin.pattern.strategy.pay;

public class PayCardPay extends Pay {
    @Override
    public void pay(double amount) {
        System.out.println("银行卡支付" + amount + "元");
    }
}

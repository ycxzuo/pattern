package com.yczuoxin.pattern.strategy.pay.test;

import com.yczuoxin.pattern.strategy.pay.handler.PayEnum;
import com.yczuoxin.pattern.strategy.pay.handler.PayHandler;

public class PayTest {

    public static void main(String[] args) {
        PayHandler.pay(1.11d, PayEnum.ALI_PAY);
        PayHandler.pay(2.22d, PayEnum.WECHAT_PAY);
        PayHandler.pay(3.33d, PayEnum.PAY_CARD_PAY);
    }

}

package com.yczuoxin.pattern.strategy.pay.handler;

import com.yczuoxin.pattern.strategy.pay.ALiPay;
import com.yczuoxin.pattern.strategy.pay.Pay;
import com.yczuoxin.pattern.strategy.pay.PayCardPay;
import com.yczuoxin.pattern.strategy.pay.WeChatPay;

public class PayHandler {

    private static final ALiPay aliPay = new ALiPay();
    private static final WeChatPay weChatPay = new WeChatPay();
    private static final PayCardPay payCardPay = new PayCardPay();

    public static void pay(double amount, PayEnum payEnum) {
        if (PayEnum.ALI_PAY == payEnum) {
            aliPay.pay(amount);
        } else if (PayEnum.WECHAT_PAY == payEnum) {
            weChatPay.pay(amount);
        } else if (PayEnum.PAY_CARD_PAY == payEnum) {
            payCardPay.pay(amount);
        } else {
            throw new RuntimeException("不支持该支付方式");
        }
    }

}

package com.yczuoxin.pattern.singleton.doublecheck;

/**
 * @program: pattern
 * @description: 双重校验
 * @author: yczuoxin
 * @create: 2018-08-04 14:58
 **/
public class DoubleCheck {
    private static volatile DoubleCheck doubleCheck;

    private DoubleCheck(){}

    public static DoubleCheck getInstance(){
        if (null == doubleCheck){
            synchronized (DoubleCheck.class){
                if(null == doubleCheck){
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}

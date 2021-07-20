package com.yczuoxin.pattern.singleton.hungry;

/**
 * @program: pattern
 * @description: 饿汉式
 * @author: yczuoxin
 * @create: 2018-08-04 09:20
 **/
public class Hungry {
    private static Hungry hungry = new Hungry();

    public Hungry(){}

    public static Hungry getInstance(){
        return hungry;
    }
}

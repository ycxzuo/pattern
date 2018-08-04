package com.yczuoxin.pattern.singleton.serialize;

import java.io.Serializable;

/**
 * @program: pattern
 * @description: 序列化
 * @author: yczuoxin
 * @create: 2018-08-04 16:04
 **/
public class Serialize implements Serializable {
    private static Serialize serialize = new Serialize();

    private Serialize(){}

    public static Serialize getInstance(){
        return serialize;
    }

    protected Object readResolve(){
        return  serialize;
    }
}

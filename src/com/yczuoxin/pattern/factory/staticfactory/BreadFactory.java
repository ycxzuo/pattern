package com.yczuoxin.pattern.factory.staticfactory;

import com.yczuoxin.pattern.factory.simple.Bread;

public class BreadFactory {

    public static Bread create(String name) {
        return new Bread(name);
    }

}

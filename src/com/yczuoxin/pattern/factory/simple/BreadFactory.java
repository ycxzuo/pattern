package com.yczuoxin.pattern.factory.simple;

public class BreadFactory {

    public Bread create(String name) {
        return new Bread(name);
    }

}

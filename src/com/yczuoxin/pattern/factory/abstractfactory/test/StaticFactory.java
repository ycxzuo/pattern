package com.yczuoxin.pattern.factory.abstractfactory.test;

import com.yczuoxin.pattern.factory.simple.Bread;
import com.yczuoxin.pattern.factory.staticfactory.BreadFactory;

public class StaticFactory {

    public static void main(String[] args) {
        Bread bread = BreadFactory.create("static bread");
        System.out.println(bread.getName());
    }

}

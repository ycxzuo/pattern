package com.yczuoxin.pattern.factory.abstractfactory.test;

import com.yczuoxin.pattern.factory.simple.Bread;
import com.yczuoxin.pattern.factory.simple.BreadFactory;

public class SimpleFactory {

    public static void main(String[] args) {
        Bread bread = new BreadFactory().create("bread");
        System.out.println(bread.getName());
    }

}

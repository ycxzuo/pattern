package com.yczuoxin.pattern.singleton.statics;

/**
 * @program: pattern
 * @description: 静态内部类
 * @author: yczuoxin
 * @create: 2018-08-04 10:57
 **/
public class StaticInnerClass {

    private StaticInnerClass(){}

    static class StaticInnerClassHolder{
        private static final StaticInnerClass statics = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance(){
        return StaticInnerClassHolder.statics;
    }
}

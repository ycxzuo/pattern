package com.yczuoxin.pattern.singleton.lazy;

/**
 * @program: pattern
 * @description: 线程不安全的懒汉式
 * @author: yczuoxin
 * @create: 2018-08-04 09:31
 **/
public class ThreadUnSafeLazy {
    private static ThreadUnSafeLazy lazy;

    private ThreadUnSafeLazy(){}

    public static ThreadUnSafeLazy getInstance(){
        if(null == lazy){
            lazy = new ThreadUnSafeLazy();
        }
        return lazy;
    }
}

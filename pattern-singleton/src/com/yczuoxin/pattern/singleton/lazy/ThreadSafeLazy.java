package com.yczuoxin.pattern.singleton.lazy;

/**
 * @program: pattern
 * @description: 线程安全的懒汉式
 * @author: yczuoxin
 * @create: 2018-08-04 09:30
 **/
public class ThreadSafeLazy {
    private static ThreadSafeLazy lazy;

    private ThreadSafeLazy(){}

    public static synchronized ThreadSafeLazy getInstance(){
        if(null == lazy){
            lazy = new ThreadSafeLazy();
        }
        return lazy;
    }
}

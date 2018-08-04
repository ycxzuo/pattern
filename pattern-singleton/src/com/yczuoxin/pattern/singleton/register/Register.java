package com.yczuoxin.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: pattern
 * @description: 注册式单例容器
 * @author: yczuoxin
 * @create: 2018-08-04 11:19
 **/
public class Register {

    private static Map<String, Object> registerMap = new ConcurrentHashMap<>();

    private Register() {
    }

    static {
        Register register = new Register();
        registerMap.put(Register.class.getName(), register);
    }

    public static Object getInstance(String className) {
        if (null == className){
            className = "com.yczuoxin.pattern.singleton.register.Register";
        }
        if (!registerMap.containsKey(className)){
            try {
                registerMap.put(className,Class.forName(className).newInstance());
            } catch (Exception e) {
                System.out.println("请填写正确的类的全路径");
                e.printStackTrace();
            }
        }
        return registerMap.get(className);
    }
}

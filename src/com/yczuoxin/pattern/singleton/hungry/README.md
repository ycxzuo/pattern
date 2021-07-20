# README

## 饿汉式(线程安全)

### 设计思想
在类加载的时候就把对象创建并放到内存中

### 问题
饿汉式单例模式是线程安全的,但是该实例在类装载的时候就加入到内存中,可能会造成资源浪费.测试结果

### 测试结果
```properties
com.yczuoxin.pattern.singleton.hungry.Hungry@46bf5757
com.yczuoxin.pattern.singleton.hungry.Hungry@46bf5757
com.yczuoxin.pattern.singleton.hungry.Hungry@46bf5757
com.yczuoxin.pattern.singleton.hungry.Hungry@46bf5757
com.yczuoxin.pattern.singleton.hungry.Hungry@46bf5757
com.yczuoxin.pattern.singleton.hungry.Hungry@46bf5757
com.yczuoxin.pattern.singleton.hungry.Hungry@46bf5757
com.yczuoxin.pattern.singleton.hungry.Hungry@46bf5757
com.yczuoxin.pattern.singleton.hungry.Hungry@46bf5757
com.yczuoxin.pattern.singleton.hungry.Hungry@46bf5757
com.yczuoxin.pattern.singleton.hungry.Hungry@46bf5757
com.yczuoxin.pattern.singleton.hungry.Hungry@46bf5757
...
cost:139ms
```


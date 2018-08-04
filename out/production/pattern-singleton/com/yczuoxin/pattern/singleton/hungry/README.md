# README

## 饿汉式(线程安全)

饿汉式单例模式是线程安全的,但是该实例在类装载的时候就加入到内存中,可能会造成资源浪费.测试结果

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


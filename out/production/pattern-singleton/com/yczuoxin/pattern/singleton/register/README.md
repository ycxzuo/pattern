# README

## 注册登记式

### 设计思想

用一个容器去装载所有的对象,并在容器中用其类的限定名登记所有的对象,如果实例对象在不存在,我们注册到单例注册表中,第二次取的时候根据类的限定名去取出对应的对象.不需要重新去初始化.

### 问题

暂无

### 扩展

Spring就是利用这种方式存放各种Bean.

`org.springframework.beans.factory.support.DefaultSingletonBeanRegistry#getSingleton(String)`

### 测试结果

```properties
com.yczuoxin.pattern.singleton.register.Register@4cc45e92
com.yczuoxin.pattern.singleton.register.Register@4cc45e92
com.yczuoxin.pattern.singleton.register.Register@4cc45e92
com.yczuoxin.pattern.singleton.register.Register@4cc45e92
com.yczuoxin.pattern.singleton.register.Register@4cc45e92
com.yczuoxin.pattern.singleton.register.Register@4cc45e92
com.yczuoxin.pattern.singleton.register.Register@4cc45e92
com.yczuoxin.pattern.singleton.register.Register@4cc45e92
com.yczuoxin.pattern.singleton.register.Register@4cc45e92
com.yczuoxin.pattern.singleton.register.Register@4cc45e92
...
cost:108ms
```


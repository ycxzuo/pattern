# README

## 懒汉式

### 线程不安全的懒汉式

#### 设计思想

在获取对象时先去判断是否实例化过,如果没有实例化就实例化一个对象

#### 问题

在高并发环境下,如果一个线程访问时该对象还在实例化过程中,那么就会重新再实例化一个对象,导致线程不安全问题.

#### 测试结果

```properties
com.yczuoxin.pattern.singleton.lazy.ThreadUnSafeLazy@7fc8692f
com.yczuoxin.pattern.singleton.lazy.ThreadUnSafeLazy@304a7580
com.yczuoxin.pattern.singleton.lazy.ThreadUnSafeLazy@304a7580
com.yczuoxin.pattern.singleton.lazy.ThreadUnSafeLazy@304a7580
com.yczuoxin.pattern.singleton.lazy.ThreadUnSafeLazy@304a7580
com.yczuoxin.pattern.singleton.lazy.ThreadUnSafeLazy@304a7580
com.yczuoxin.pattern.singleton.lazy.ThreadUnSafeLazy@304a7580
com.yczuoxin.pattern.singleton.lazy.ThreadUnSafeLazy@304a7580
com.yczuoxin.pattern.singleton.lazy.ThreadUnSafeLazy@304a7580
com.yczuoxin.pattern.singleton.lazy.ThreadUnSafeLazy@304a7580
...
cost:98ms
```

### 线程安全的懒汉式

#### 设计思想

由线程不安全的懒汉式可以得出该问题出现在同时两个线程调用了getInstance()方法导致,所以给与该方法加上synchronized加锁,使得该方法只有一个线程访问,保证了线程安全.

#### 问题

synchronized锁会降低性能.增加获取实例的时间.

#### 测试结果

```properties
com.yczuoxin.pattern.singleton.lazy.ThreadSafeLazy@72f7f615
com.yczuoxin.pattern.singleton.lazy.ThreadSafeLazy@72f7f615
com.yczuoxin.pattern.singleton.lazy.ThreadSafeLazy@72f7f615
com.yczuoxin.pattern.singleton.lazy.ThreadSafeLazy@72f7f615
com.yczuoxin.pattern.singleton.lazy.ThreadSafeLazy@72f7f615
com.yczuoxin.pattern.singleton.lazy.ThreadSafeLazy@72f7f615
com.yczuoxin.pattern.singleton.lazy.ThreadSafeLazy@72f7f615
com.yczuoxin.pattern.singleton.lazy.ThreadSafeLazy@72f7f615
com.yczuoxin.pattern.singleton.lazy.ThreadSafeLazy@72f7f615
com.yczuoxin.pattern.singleton.lazy.ThreadSafeLazy@72f7f615
com.yczuoxin.pattern.singleton.lazy.ThreadSafeLazy@72f7f615
com.yczuoxin.pattern.singleton.lazy.ThreadSafeLazy@72f7f615
...
cost:129ms
```


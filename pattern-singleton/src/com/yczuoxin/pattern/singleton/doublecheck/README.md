# README

## 双重校验

### 技术思路

利用volite可见性和synchronized锁保证单例的创建是线程安全的.

### 问题

volite会使缓存失效,消耗性能,synchronized锁也导致性能的消耗,所以总的说来很耗性能.

### 测试结果

```properties
com.yczuoxin.pattern.singleton.doublecheck.DoubleCheck@7097d410
com.yczuoxin.pattern.singleton.doublecheck.DoubleCheck@7097d410
com.yczuoxin.pattern.singleton.doublecheck.DoubleCheck@7097d410
com.yczuoxin.pattern.singleton.doublecheck.DoubleCheck@7097d410
com.yczuoxin.pattern.singleton.doublecheck.DoubleCheck@7097d410
com.yczuoxin.pattern.singleton.doublecheck.DoubleCheck@7097d410
com.yczuoxin.pattern.singleton.doublecheck.DoubleCheck@7097d410
com.yczuoxin.pattern.singleton.doublecheck.DoubleCheck@7097d410
...
cost:124ms
```


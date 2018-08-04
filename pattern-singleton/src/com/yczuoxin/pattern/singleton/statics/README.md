# README

## 静态内部类

### 设计思想

只有在使用静态内部类的时候静态内部类才会实例化,只有使用到了静态内部类才会实例化该对象.不会造成对资源的浪费.

### 问题

创建对象所用时间较长.

### 测试结果

```properties
com.yczuoxin.pattern.singleton.statics.StaticInnerClass@2d5a99cd
com.yczuoxin.pattern.singleton.statics.StaticInnerClass@2d5a99cd
com.yczuoxin.pattern.singleton.statics.StaticInnerClass@2d5a99cd
com.yczuoxin.pattern.singleton.statics.StaticInnerClass@2d5a99cd
com.yczuoxin.pattern.singleton.statics.StaticInnerClass@2d5a99cd
com.yczuoxin.pattern.singleton.statics.StaticInnerClass@2d5a99cd
com.yczuoxin.pattern.singleton.statics.StaticInnerClass@2d5a99cd
com.yczuoxin.pattern.singleton.statics.StaticInnerClass@2d5a99cd
com.yczuoxin.pattern.singleton.statics.StaticInnerClass@2d5a99cd
com.yczuoxin.pattern.singleton.statics.StaticInnerClass@2d5a99cd
com.yczuoxin.pattern.singleton.statics.StaticInnerClass@2d5a99cd
...
cost:146ms
```


# README

## 序列化反序列化

### 设计思想

利用序列化和反序列来创建对象,为了使创建的对象是单例,必须实现Serializable接口及重写`readResolve()`,当实现了readResolve方法后,jvm就会有readResolve返回指定对象,也就保证了单例性.

```java
protected Object readResolve(){
    return  serialize;
}
```

### 缺点

使用起来比较复杂,还要使用到IO读写

### 测试结果

```properties
com.yczuoxin.pattern.singleton.serialize.Serialize@4554617c
com.yczuoxin.pattern.singleton.serialize.Serialize@4554617c
```


学习笔记
# PriorityQueue源码分析
## 属性
### DEFAULT_INITIAL_CAPACITY
```java
private static final int DEFAULT_INITIAL_CAPACITY = 11;
```
默认初始化容量为11.

### size
```java
int size;
```
队列中元素个数

### comparator
```java
private final Comparator<? super E> comparator; 
```
用户自定义比较器，用来确定队列中元素的优先级

### queue
```java
transient Object[] queue;
```
用来保存队列中数据的数组



###
```java

```

## 构造方法
### 默认构造方法
```java
public PriorityQueue() {
        this(DEFAULT_INITIAL_CAPACITY, null);
    }
```

### 指定初始队列大小的构造方法
```java
public PriorityQueue(int initialCapacity) {
        this(initialCapacity, null);
    }
```

### 指定比较器的构造方法
```java
public PriorityQueue(Comparator<? super E> comparator) {
        this(DEFAULT_INITIAL_CAPACITY, comparator);
    }
```


## 方法
### add(E e)
向优先队列中添加元素，添加失败时抛出异常，添加成功时返回true.

### clear()
清空优先队列

### comparator()
获取优先队列的比较器

### offer​(E e)
同add(E e)，向优先队列中添加元素，添加失败时抛出异常，添加成功时返回true.

### peek()
返回优先队列中最小的元素

### remove​(Object o)
从优先队列汇总remove掉指定元素


学习笔记
# HashMap的使用场景
HashMap适用于存储键值对，且允许键、值为空的情况，因为不是同步的，所以HashMap不是线程安全的。


# HashMap的数据结构
HashMap继承自AbstractMap，实现了Map, Cloneable, Serializable接口。
在HashMap中使用Entry数据来存储数据。



# HashMap的工作原理
  HashMap读写数据的核心是hash。存储对象时，我们将K/V传给put方法，然后计算key的hashCode并进行hash运算从而得到bucket位置，
  进一步存储，HashMap会根据当前bucket的占用情况自动调整容量(超过Load Facotr（默认为当前size的0.75倍）则resize为原来的2倍)。获取对象时，我们将K传给get，
  它调用hashCode计算hash从而得到bucket位置，并进一步调用equals()方法确定键值对。如果发生碰撞的时候，Hashmap通过链表将产生碰撞
  冲突的元素组织起来，在Java 8中，如果一个bucket中碰撞冲突的元素超过某个限制(默认是8)，则使用红黑树来替换链表，从而提高查询速度。
  
# 主要方法
### get
获取key对应的value

### put(key,value)
将（key,value）对写入hashmap

### remove(key)
从hashmap中删除键为key的元素

### containsKey(key)
hashmap中是否包含键为key的元素

### containsValue(value)
hashmap中是否包含值为value的元素

### entrySet()
返回hashmap中所有entry的集合

### keySet()
返回hashmap中所有key的集合

### valueSet()
返回hashmap中所有value的集合


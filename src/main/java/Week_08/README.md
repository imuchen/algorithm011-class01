学习笔记

# 位运算技巧

### 1. 位操作实现乘除法

- 数 a 向右移一位，相当于将 a 除以 2；数 a 向左移一位，相当于将 a 乘以 2

```text
int a = 2;
a >> 1; ---> 1
a << 1; ---> 4
```

### 2. 位操作交换两数

- 位操作交换两数可以不需要第三个临时变量，虽然普通操作也可以做到，但是没有其效率高

```text
//普通操作
void swap(int &a, int &b) {
  a = a + b;
  b = a - b;
  a = a - b;
}

//位与操作
void swap(int &a, int &b) {
  a ^= b;
  b ^= a;
  a ^= b;
}
```

位与操作解释：第一步：a ^= b ---> a = (a^b); 

第二步：b ^= a ---> b = b^(a^b) ---> b = (b^b)^a = a

第三步：a ^= b ---> a = (a^b)^a = (a^a)^b = b

### 3. 位操作判断奇偶数

- 只要根据数的最后一位是 0 还是 1 来决定即可，为 0 就是偶数，为 1 就是奇数。

```text
if(0 == (a & 1)) {
 //偶数
}
```

### 4. 位操作交换符号

- 交换符号将正数变成负数，负数变成正数

```text
int reversal(int a) {
  return ~a + 1;
}
```

整数取反加1，正好变成其对应的负数(补码表示)；负数取反加一，则变为其原码，即正数

### 5. 位操作求绝对值

- 整数的绝对值是其本身，负数的绝对值正好可以对其进行取反加一求得，即我们首先判断其符号位（整数右移 31 位得到 0，负数右移 31 位得到 -1,即 0xffffffff），然后根据符号进行相应的操作

```text
int abs(int a) {
  int i = a >> 31;
  return i == 0 ? a : (~a + 1);
}
```

上面的操作可以进行优化，可以将 i == 0 的条件判断语句去掉。我们都知道符号位 i 只有两种情况，即 i = 0 为正，i = -1 为负。对于任何数与 0 异或都会保持不变，与 -1 即 0xffffffff 进行异或就相当于对此数进行取反,因此可以将上面三目元算符转换为((a^i)-i)，即整数时 a 与 0 异或得到本身，再减去 0，负数时与 0xffffffff 异或将 a 进行取反，然后在加上 1，即减去 i(i =-1)

```text
int abs2(int a) {
  int i = a >> 31;
  return ((a^i) - i);
}
```

### 6. 位操作进行高低位交换

- 给定一个 16 位的无符号整数，将其高 8 位与低 8 位进行交换，求出交换后的值，如：

```text
34520的二进制表示：
10000110 11011000

将其高8位与低8位进行交换，得到一个新的二进制数：
11011000 10000110
其十进制为55430
```

从上面移位操作我们可以知道，只要将无符号数 a>>8 即可得到其高 8 位移到低 8 位，高位补 0；将 a<<8 即可将 低 8 位移到高 8 位，低 8 位补 0，然后将 a>>8 和 a<<8 进行或操作既可求得交换后的结果。

```text
unsigned short a = 34520;
a = (a >> 8) | (a << 8);
```
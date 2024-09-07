# Bitwise Operations

Bitwise Operations are always faster that the arithmetic operations

# Bitwise Operators

- AND - &
- OR  - |
- NOT - ~
- XOR - ^
- Left Shift  - <<
- Right Shift - >>

![Operator](https://media.geeksforgeeks.org/wp-content/uploads/20220922145839/BItwiseoperatortruthtable-300x197.png)

# Even or Odd

If the last bit is 1 then the number is odd, otherwise even.

____1&1=1 odd \
____0&1=0 even

### Using Arithmetic - (NOOB)

```java
if(num%2==0){
    System.out.println("Number is Even")
}
else{
    System.out.println("Number is Odd")
}
```

### Using Bitwise (PRO)

```java
if(num&1==0){
    System.out.println("Even")
}
else{
    System.out.println("Odd")

}
```
### [Code](./operator.java)

# Questions

- [Count the number of 1 bits in an integer.](./counting1bit.java)
- [Counting Bits - Leetcode](https://leetcode.com/problems/counting-bits/)
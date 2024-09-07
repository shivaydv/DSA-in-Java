# Number System

![Number System Image](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200918224434/Number-System.png)


# Convert Decimal to Binary

1. Binary Timeline

![Binary Timeline](https://media.hswstatic.com/eyJidWNrZXQiOiJjb250ZW50Lmhzd3N0YXRpYy5jb20iLCJrZXkiOiJnaWZcL2JpbmFyeS1kZWNpbWFsLTIuanBnIiwiZWRpdHMiOnsicmVzaXplIjp7IndpZHRoIjo4Mjh9fX0=)

2. Division Method

![Division Method](https://media.geeksforgeeks.org/wp-content/uploads/decimal2binaryPython.png)

# Algorithm for decimal to binary (Not Optimised)

1. Take input from user
2. loop until num > 0
*   rem = num %2
*   num = num /2
*   res = rem + res
3. end loop
4. print res

### Code
```java
String res ="";

while(num>0){
    int rem = num % 2 ;
    num = num/2;
    res = rem +res;
}

System.out.println("Binary of the number is: "+res);
```
# Optimised Conversion at Bit Level

### Algorithm toBinary

1. Take the last bit with AND Operator(&1)
2. Prepend to the result
3. Right Shift by 1 (>>)
4. Do it till number become 0

### Algorithm toDecimal

1. Take the last digit (%10)
2. if last digit is 1
3. add 2^index in the result
4. Do it till number become 0

### [Code](./convertor.java)


# Reverse Number

### Algorithm

1. Take the last digit
2. check if the result is within the range of integer after multiply it by 10
2. Store it in result (result = result*10 +lastdigit)
3. divide the number by 10
4. do it till number is greater than 0

[LeetCode Problem](https://leetcode.com/problems/reverse-integer/description/) \
[Solution](./reverseint.java)

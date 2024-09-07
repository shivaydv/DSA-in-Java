# Questions

## 1. Reverse Number

### Algorithm

1. Take the last digit
2. check if the result is within the range of integer after multiply it by 10
2. Store it in result (result = result*10 +lastdigit)
3. divide the number by 10
4. do it till number != 0

[LeetCode Problem](https://leetcode.com/problems/reverse-integer/description/) \
[Solution](./reverseInt.java)

## 2. Power of Two

if the number is power of two then its binary will only have one "1" bit.

2-10 \
4-100 \
8 - 1000

6 - 110 (not a power of two)

### Algorithm
1. take the last bit of number
1. Right Shift by 1
1. if last bit it 1 and number !=0
1. return false
1. else return true

[LeetCode Problem](https://leetcode.com/problems/power-of-two/description/) \
[Solution](./powerOfTwo.java)

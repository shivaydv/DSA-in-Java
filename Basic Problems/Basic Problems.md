# Questions

## 1. Reverse Number

### Algorithm

1. Take the last digit
2. check if the result is within the range of integer after multiply it by 10
2. Store it in result (result = result*10 +lastdigit)
3. divide the number by 10
4. do it till number != 0

```java
public class reverseInt {

    static int reverse(int num){
        int result = 0;
            while(num!=0){
                int lastdigit = num%10;

                //check if number is within the range of integer after multiplying by 10
                if( result < Integer.MIN_VALUE/10 || result > Integer.MAX_VALUE/10){
                    return 0;

                }
                result = result*10 + lastdigit;
                num = num/10;
            }
            return result;
        }

      public static void main(String[] args) {
           int ans = reverse(-321);
           System.out.println(ans);
      }

}
```

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

```java
public class powerOfTwo {

    static boolean isPowerOfTwo(int num) {
        if (num <= 0) {
            return false;
        }
        while (num != 0) {
            int lastbit = num & 1;

            num = num >> 1;

            if (lastbit == 1 && num != 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(isPowerOfTwo(num));

    }
}
```
[LeetCode Problem](https://leetcode.com/problems/power-of-two/description/) \
[Solution](./powerOfTwo.java)

## 3. Complement of Base 10 Integer

The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.


### Algorithm

1. create a copy of integer
1. create a mask of a integer with all 1's in binary
1. return (~num) & mask

5= 000000101 \
~5 = 111111010 \
mask = 111 \
~5 & mask = 010

```java
class bitwiseComplementInteger {

    public int bitwiseComplement(int n) {
        int mask = 0;
        int num = n;

        if (n == 0) {
            return 1;
        }
        while (n != 0) {
            mask = mask << 1 | 1;
            n = n >> 1;
        }
        return (~num) & mask;
    }

    public static void main(String[] args) {
        bitwiseComplementInteger obj = new bitwiseComplementInteger();
        System.out.println(obj.bitwiseComplement(7));
    }
}
```

[LeetCode Problem](https://leetcode.com/problems/complement-of-base-10-integer/description/) \
[Solution](./bitwiseComplementInteger.java)


## 4. Count Prime

### Normal Method

```java
public class countPrime {

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 2;

        int count = 0;

        for (int i = 0; i < num; i++) {
            if (isPrime(i)) {
                count = count + 1;
                System.out.println(i);
            }
        }
        System.out.println("Total Prime Numbers = " + count);
    }
}
```

### Better Algorithm - Sieve of Eratosthenes

- write counting from 1 to n-1
- assume that all the numbers are prime
- mark 1 as false
- take the index with true and mark its multiples as false [ 2(true)-> 4,6,8,...(false) ]
- increase the count for every true value
- repeat this till all numbers are completed

```java
public class countPrime {

    public static void main(String[] args) {
        int n = 3;

        int count = 0;
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
                for (int j = i * 2; j < n; j = j + i) {
                    primes[j] = false;
                }
            }
        }

        System.out.println("Total Prime Numbers = " + count);
    }
}
```
[Leetcode Problem](https://leetcode.com/problems/count-primes/) \
[Solution](./countPrime.java)
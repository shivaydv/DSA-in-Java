# Number System

![Number System Image](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200918224434/Number-System.png)



## Decimal-Binary Conversion

### Ways to Convert Decimal to Binary

1. Binary Timeline

<!-- ![Binary Timeline](https://media.hswstatic.com/eyJidWNrZXQiOiJjb250ZW50Lmhzd3N0YXRpYy5jb20iLCJrZXkiOiJnaWZcL2JpbmFyeS1kZWNpbWFsLTIuanBnIiwiZWRpdHMiOnsicmVzaXplIjp7IndpZHRoIjo4Mjh9fX0=) -->

2. Division Method

<!-- ![Division Method](https://media.geeksforgeeks.org/wp-content/uploads/decimal2binaryPython.png) -->

### Algorithm for decimal to binary (Not Optimised)

1. Take input from user
2. loop until num > 0
1.   rem = num %2
1.   num = num /2
1.   res = rem + res
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
## Optimised Conversion at Bit Level

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

```java
public class convertor {

    static void toBinary(int decimal) {

        String result = "";

        while (decimal > 0) {

            int lastbit = decimal & 1;
            result = lastbit + result;
            decimal = decimal >> 1;
        }

        System.out.println(result);
    }

    static void toDecimal(int binary){
        int result =0;
        int index =0;

        while(binary>0){
            int lastdigit = binary%10;
            if(lastdigit == 1){
                result = result + (int) Math.pow(2,index);
            }
            index++;
            binary = binary/10;
        }

        System.out.println(result);
    }

    public static void main(String args[]) {
        toBinary(12);
        toDecimal(1100);
    }

}
```

### [Solution](./convertor.java)

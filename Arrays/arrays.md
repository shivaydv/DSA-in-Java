# What is an Array?
An array is a collection of items of the same variable type that are stored at contiguous memory locations. It’s one of the most popular and simple data structures and is often used to implement other data structures. Each item in an array is indexed starting with 0 . Each element in an array is accessed through its index.

# Array Operations
Common operations performed on arrays include:

- **Traversal** : Visiting each element of an array in a specific order (e.g., sequential, reverse).
- **Insertion** : Adding a new element to an array at a specific index.
- **Deletion** : Removing an element from an array at a specific index.
- **Searching** : Finding the index of an element in an array.


# Why array index start from 0

The reason why index start from zero is that index is used as an offset. Suppose we have an array Arr = [1,2,3,4,5] Arr[0] actually means that first element is 0 element away from the memory location where the arr points as elements in an array are stored in a contiguous manner.

```java
arr = 1000
int arr[0] = arr + (0 * size) = 1000
int arr[1] = arr + (1 * size) = 1004
```

# Syntax of array

```java
int[] numbers; // Declaring an integer array

numbers = new int[5]; // Creating an array of 5 integers

numbers[0] = 10; // Setting the first element of the array

int firstElement = numbers[0]; // Accessing the first element

numbers[0] = 20; // Changing the first element to 20

int length = numbers.length; // Getting the length of the array
```

```java
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; // Declaring array literal

int[] intArray = {1, 2, 3, 4, 5}; // A single-dimensional array

int[][] intArray = new int[10][20]; //a 2D array or matrix

int[][][] intArray = new int[10][20][10]; //a 3D array
```

# Advantages of Java Arrays
- **Efficient Access:** Accessing an element by its index is fast and has constant time complexity, O(1).
- **Memory Management:** Arrays have fixed size, which makes memory management straightforward and predictable.
- **Data Organization:** Arrays help organize data in a structured manner, making it easier to manage related elements.

# Disadvantages of Java Arrays
- **Fixed Size:**  Once an array is created, its size cannot be changed, which can lead to memory waste if the size is overestimated or insufficient storage if underestimated.
- **Type Homogeneity:** Arrays can only store elements of the same data type, which may require additional handling for mixed types of data.
- **Insertion and Deletion:** Inserting or deleting elements, especially in the middle of an array, can be costly as it may require shifting elements.

# Questions

## 1. Single Number

[Leetcode Problem](https://leetcode.com/problems/single-number)

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.


#### Time Complexity - O(n^2)

```java
    public static int singleNum(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j] && arr[i] != -1 && i != j){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        if(arr[i] != -1) return arr[i];
        }
    return -1;
    }
```

#### Time Complexity - O(n)

0^num = num \
same num ^ same num =0 \


2^2^1 =1 \
3^4^5^2^4^5^3 = 2

```java
public static int singleNum(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans = ans^arr[i];
        }
        return ans;
    }
```

[Solution](./singleNumber.java)

## 2. Two Sum

[Leetcode Problem](https://leetcode.com/problems/two-sum)

#### Time Complexity - O(n^2)

```java
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for(int i =0; i<size-1;i++){
            int targetsum = target - nums[i];
            for(int j =i+1;j<size;j++){
                if(targetsum == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static void main (String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(arr,target);
        System.out.println(result[0] + " " + result[1]);
    }
}
```

#### Optimised Solution - Hashmap

```java
```

[Solution](./TwoSum.java)

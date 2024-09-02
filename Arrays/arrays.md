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

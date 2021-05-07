# Sorting a K-sorted Array

This is a simple Java program to demonstrate how to sort an already
k-sorted array.

## Input

```shell script
Original array: [6, 5, 3, 2, 8, 10, 9]
K = 3
----------------------
```

## Output

```shell script
Sorted array: [2, 3, 5, 6, 8, 9, 10]
----------------------
```

## Process
Let k = 3.

From index = 0, it means that the element that should be at index 0 is 
somewhere in the [0 - 3] sub-array. If it's an array sorted in the ascending
order, it means that the element that should be at index 0 is the smallest
element in that sub array.

So for each index in the array, find the smallest element in the [index - k + 1]
sub-array, and the swap that with the element at the index. You'll have a
completely sorted array at the end.
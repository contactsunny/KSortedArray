package com.contactsunny.poc.ksortedarray;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] array = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("K = " + k);
        System.out.println("----------------------");

        sortArray(array, k);

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("----------------------");
    }

    /**
     * Method to sort the partially sorted array
     *
     * @param array input array
     * @param k the k value
     */
    private static void sortArray(int[] array, int k) {
        // Iterating through the length of the array
        for (int index = 0; index < array.length; index++) {
            // One of the elements in the k+1 elements starting from the
            // current index will be the value that comes to index.
            // For an array sorted in the ascending order, it'll be the
            // element with the minimum value. So finding the index
            // of the minimum value in the sub-array starting from index to k+1 elements.
            int minIndex = findMinValue(array, index, k + 1);
            // Swapping the value at the current index with the value at the minIndex
            if (minIndex != index) {
                int temp = array[minIndex];
                array[minIndex] = array[index];
                array[index] = temp;
            }
        }
    }

    /**
     * Method to find the index of the smallest element in the given sub-array.
     *
     * @param array The given array
     * @param start the start index of the sub-array
     * @param length the length of the sub-array
     *
     * @return index of the smallest element in the sub-array
     */
    private static int findMinValue(int[] array, int start, int length) {
        // If the start index + length value is more than the array length,
        // it'll throw array out of the bounds exception.
        if (length > (array.length - start)) {
            length = array.length;
        }

        // Assuming the smallest element is the first element in the sub-array
        int min = start;
        // Iterating through the sub-array to find the index smallest element.
        for (int index = start; index < length; index++) {
            if (array[index] < array[min]) {
                min = index;
            }
        }

        return min;
    }
}

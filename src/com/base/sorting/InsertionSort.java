package com.base.sorting;

// Selection Sort
// algorithm Time complexity: O(n^2)

import java.util.Arrays;

public class InsertionSort {
    public static int[] InsertionSort(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);

        for (int firstUnseortedIndex = 1; firstUnseortedIndex < array.length; firstUnseortedIndex++) {
            int newElement = array[firstUnseortedIndex];

            int i = 0;
            for(i = firstUnseortedIndex; i > 0 && array[i-1] > newElement; i--) {
                array[i] = array[i-1];
            }

            array[i] = newElement;
        }

        return  array;
    }

    private static void swap(int[] array, int x, int y) {
        array[x] ^= array[y];
        array[y] ^= array[x];
        array[x] ^= array[y];
    }
}

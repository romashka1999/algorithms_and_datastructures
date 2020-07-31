package com.base.sorting;

// Selection Sort
// algorithm Time complexity: O(n^2)

import java.util.Arrays;

public class SelectionSort {

    public static int[] SelectionSort(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        int lastUnsortedIndex = array.length - 1;
        while(lastUnsortedIndex > 0) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(array[largest] < array[i]) {
                    largest = i;
                }
            }
            swapArrayElements(array, largest, lastUnsortedIndex);
            lastUnsortedIndex --;
        }
        return array;
    }

    private static void swapArrayElements(int[] array, int x, int y) {
        if(x == y) {
            return;
        }
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}

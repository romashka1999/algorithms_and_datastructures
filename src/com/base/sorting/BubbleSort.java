package com.base.sorting;

import java.util.Arrays;

// Bubble Sort
// algorithm Time complexity: O(n^2)

public class BubbleSort {

    public static int[] BubbleSort(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        int lastUnsortedIndex = array.length - 1;
        while(lastUnsortedIndex > 0) {
            boolean flag = true;
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if(array[i] > array[i+1]) {
                    swapArrayElements(array, i, i+1);
                    flag = false;
                }
            }
            if(flag) {
                break;
            }
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

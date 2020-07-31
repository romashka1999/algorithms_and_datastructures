package com.base;

import com.base.sorting.BubbleSort;

public class Main {

    public static void main(String[] args) {
        int[] a = {3,5,-4,34,2};
        int[] arr = BubbleSort.BubbleSort(a);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}

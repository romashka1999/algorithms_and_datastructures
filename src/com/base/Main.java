package com.base;

import com.base.sorting.BubbleSort;
import com.base.sorting.InsertionSort;
import com.base.sorting.SelectionSort;

public class Main {

    public static void main(String[] args) {
        int[] a = {3,5,-4,34,2};
        int[] arr = InsertionSort.InsertionSort(a);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}

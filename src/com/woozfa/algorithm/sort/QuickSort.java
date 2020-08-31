package com.woozfa.algorithm.sort;

import java.sql.SQLOutput;

public class QuickSort {
    // given -----------------------------------------------
    int[] arr = {3, 7, 4, 2, 6, 5, 1};
    int[] sortedArr = {1, 2, 3, 4, 5, 6, 7};
    // -----------------------------------------------------

    public void solution() {
        System.out.print("Input Arr: ");
        printArr(arr);
        System.out.print("Expect Arr: ");
        printArr(sortedArr);
        quickSort(arr);
        System.out.print("Result Arr: ");
        printArr(arr);
    }

    private void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);
        if (start < part2 - 1) {
            quickSort(arr, start, part2 - 1);
        }
        if (part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = end;
        arr[end] = tmp;
    }

    private static void printArr(int[] arr) {
        for (int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }

}


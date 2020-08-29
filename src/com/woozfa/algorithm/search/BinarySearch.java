package com.woozfa.algorithm.search;

public class BinarySearch {
    // given
    int[] arr = {1, 3, 5, 6, 7, 8, 9, 11, 23, 34, 50};
    int num = 6;
    int expected = 3;

    public void solution() {
        int left = 0;
        int right = arr.length;

        int result = binarySearchRecursive(arr, num, left, right);

        System.out.println(result == expected ? "True" : "False");
        System.out.println("expected: " + expected + ", result: " + result);
    }

    public int binarySearchRecursive(int[] arr, int num, int left, int right) {
        if (left >= right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (num == arr[mid]) {
            return mid;
        } else if (num > arr[mid]) {
            return binarySearchRecursive(arr, num, mid + 1, right);
        } else if (num < arr[mid]) {
            return binarySearchRecursive(arr, num, left, mid - 1);
        }

        return -1;
    }
}
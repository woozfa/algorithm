package com.woozfa.algorithm.search;

public class BinarySearch {
    // given -----------------------------------------------
    int[] sortedArr = {1, 3, 5, 6, 7, 8, 9, 11, 23, 34, 50};
    int num = 8;
    int expected = 5;
    // -----------------------------------------------------

    public void solution() {
        int low = 0;
        int high = sortedArr.length;

        int result = binarySearch(sortedArr, num, low, high);
        //int result = binarySearchRecursive(sortedArr, num, low, high);

        System.out.println("#1. BinarySearch");
        System.out.print(result == expected ? "True" : "False");
        System.out.println(" (expected: " + expected + ", result: " + result + ")");
    }

    private int binarySearch(int[] arr, int num, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (num == arr[mid]) {
                return mid;
            } else if (num > arr[mid]) {
                low = mid + 1;
            } else if (num < arr[mid]) {
                high = mid - 1;
            }
        }

        return -1;
    }

    public int binarySearchRecursive(int[] arr, int num, int low, int high) {
        if (low >= high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (num == arr[mid]) {
            return mid;
        } else if (num > arr[mid]) {
            return binarySearchRecursive(arr, num, mid + 1, high);
        } else if (num < arr[mid]) {
            return binarySearchRecursive(arr, num, low, mid - 1);
        }

        return -1;
    }
}
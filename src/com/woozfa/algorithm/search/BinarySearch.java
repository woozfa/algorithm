package com.woozfa.algorithm.search;

public class BinarySearch {
    public int solution(int[] arr, int num) {

        //return binarySearch(arr, num);

        int low = 0;
        int high = arr.length;
        return binarySearchRecursive(arr, num, low, high);

    }

    private int binarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length;

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
        if (low > high) {
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
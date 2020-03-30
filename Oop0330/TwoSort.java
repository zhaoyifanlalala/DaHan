package com.banyuan.homework1;

public class TwoSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,7,9,23,24,67,90,111};
        System.out.println(search(arr, 9));
    }
    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (key < arr[middle]) {
                end = middle - 1;
            } else if (key > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}

package com.banyuan.homework1;

import java.util.Arrays;
/*

 */
public class SelectSort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {26, 53, 48, 11, 13, 48, 32, 15};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

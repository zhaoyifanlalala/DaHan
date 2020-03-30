package com.banyuan.homework1;

public class QuickSort {
    public static void main(String[] args) {
        int[] arrays = {6,12,23,1,4,56,34,67,8,15,23,22};
        arrays = quicksort(0, arrays.length, arrays);
        for (int i : arrays) {
            System.out.print(i + " ");
        }
    }
    public static int[] quicksort(int i, int j, int[] arrays) {
        if (j - i == 1) {
            return arrays;
        }
        if (i >= arrays.length) {
            return arrays;
        }
        int base = arrays[i];// 基准值
        int k = i;
        int length = j;
        for (--j; j > i; j--) {
            if (arrays[j] < base) {// 出现基准数右边的数比基准数小
                for (k=0; k < length; k++) {
                    if (k == j) {
                        int temp = arrays[k];
                        arrays[k] = arrays[i];
                        arrays[i] = temp;
                        quicksort(k + 1, length, arrays);
                        quicksort(i, k, arrays);
                        return arrays;
                    } else if (arrays[k] > base) {
                        int temp = arrays[k];
                        arrays[k] = arrays[j];
                        arrays[j] = temp;
                        break;
                    }
                }
            }
        }
        return arrays;
    }
}

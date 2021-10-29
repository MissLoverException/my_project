package com.missloverexception.project.interview.sort;

import java.util.Arrays;

public class MergeSort {

    public static int[] forkKits(int[] arr) {
        if (arr.length == 0) return arr;
        if (arr.length > 2) {
            int midNum = arr.length / 2;
            int[] arr1 = forkKits(Arrays.copyOf(arr, midNum));
            int[] arr2 = forkKits(Arrays.copyOfRange(arr, midNum, arr.length));
            return joinKits(arr1, arr2);
        } else {
            if (arr.length == 1 || arr[0] < arr[1]) {
                return arr;
            } else {
                int[] result = new int[2];
                result[0] = arr[1];
                result[1] = arr[0];
                return result;
            }
        }
    }

    public static int[] joinKits(int[] arr1, int[] arr2) {
        int index1 = arr1.length;
        int index2 = arr2.length;
        int indexAll = index1 + index2;
        int[] arrAll = new int[indexAll];
        for (int i = 0, i1 = 0, i2 = 0; i < indexAll; i++) {
            int a1 = i1 >= index1 ? Integer.MAX_VALUE : arr1[i1];
            int a2 = i2 >= index2 ? Integer.MAX_VALUE : arr2[i2];
            if (a1 <= a2) {
                arrAll[i] = a1;
                i1++;
            } else {
                arrAll[i] = a2;
                i2++;
            }
        }
//        System.out.println(arrAll.length);
        return arrAll;
    }

    public static void main(String[] args) {
        int n = 100000000;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
        }
        long beginTime = System.currentTimeMillis();
        int[] result = forkKits(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - beginTime);
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + "\t");
//        }
//        System.out.println();
//        System.out.println(arr.length);
//        System.out.println(result.length);
    }
}

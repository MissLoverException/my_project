package com.missloverexception.project.interview.sort;

public class FastSort {

    private static int[] fastSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int a = arr[0];
        return null;
    }

    public static void main(String[] args) {
        int n = 10000000;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
        }
        long beginTime = System.currentTimeMillis();
        int[] result = fastSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - beginTime);
    }


}

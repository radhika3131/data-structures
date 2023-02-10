package com.datastructures.array;

/**
 * Problem Statement#
 * In this problem, given two sorted arrays, you have to implement the int[] mergeArrays(int[] arr1, int[] arr2) method, which returns an array consisting of all elements of both arrays in a sorted way.
 *
 * Method Prototype#
 * int[] mergeArrays(int[] arr1, int[] arr2)
 * Here arr1 and arr2 are sorted already.
 *
 * Output#
 * Merged array consisting of all elements of both arrays in a sorted way.
 *
 * Sample Input#
 * arr1 = {1, 3, 4, 5}
 * arr2 = {2, 6, 7, 8}
 * Sample Output#
 * arr = {1, 2, 3, 4, 5, 6, 7, 8}
 */

public class checkMergeArray {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] resultArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                resultArray[k++] = arr1[i++];
            } else {
                resultArray[k++] = arr2[j++];
            }
        }
        // if elements left in arr1
        while (i < arr1.length) {
            resultArray[k++] = arr1[i++];
        }
        // if elements left in aar2
        while (j < arr2.length) {
            resultArray[k++] = arr2[j++];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 12, 14, 17, 23};
        int[] arr2 = {11, 19, 27};
        System.out.println("Array1 Before merging!");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("Array2 Before merging!");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        int[] resultantArray = mergeArrays(arr1, arr2); // calling mergeArrays

        System.out.print("Arrays after merging: ");
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            System.out.print(resultantArray[i] + " ");
        }
    }
}

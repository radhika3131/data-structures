package com.datastructures.Sorting;

import java.util.Scanner;

public class MergeTwoSortedArray {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int size1 = a.length;
        int size2 = b.length;

        int[] result = new int[size1+size2];

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        while(index1 < a.length && index2 < b.length)
        {
            if(a[index1] <= b[index2])
            {
                result[index3] = a[index1];
                index1++;
                index3++;
            }
            else
            {
                result[index3] = b[index2];
                index2++;
                index3++;
            }
        }

        while(index1 < a.length)
        {
            result[index3] = a[index1];
            index1++;
            index3++;
        }

        while(index2 < b.length)
        {
            result[index3] = b[index2];
            index2++;
            index3++;
        }

        return result;
    }

    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for(int i = 0 ; i < m; i++){
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a,b);
        print(mergedArray);
    }
}

package com.datastructures.Sorting;

import java.util.Scanner;

public class RadixSort {
    public static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i : arr)
        {
            max = Math.max(max , i);
        }

        int len= 0;
        while(max != 0)
        {
            max /= 10;
            len++;
        }

        for( int i =1; i<= len ; i++)
        {
            countSort(arr,(int)(Math.pow(10,i)));
        }

    }


    public static void countSort(int[] arr, int exp) {
        // write code here
        int size = 10;
        int[] freq = new int[size];

        int pow = exp;

        for(int i =0 ; i<arr.length; i++)
        {
            int ele = (arr[i]%pow)/(pow/10);
            int index = ele  ;
            freq[index] += 1;
        }

        int[] prefix = new int[size];
        int sum = 0;
        for(int i =0; i< size ; i++)
        {
            sum += freq[i];
            prefix[i] = sum;
        }

        int[] ans = new int[arr.length];
        for(int i = arr.length -1 ; i>= 0 ; i--)
        {
            int ele = (arr[i]%pow)/(pow/10);
            int index = ele ;
            int val = prefix[index] - 1;
            ans[val] = arr[i];
            prefix[index] -= 1;
        }

        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = ans[i];
        }

        System.out.print("After sorting on " + (exp/10) + " place -> ");
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }
}

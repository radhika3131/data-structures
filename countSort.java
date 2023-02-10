package com.datastructures.Sorting;

import java.util.Scanner;

public class countSort {
    public static void countSort(int[] arr, int min, int max) {
        //write your code here
        int size = max - min + 1;
        int[] freq = new int[size];

        for(int i =0 ; i<arr.length; i++)
        {
            int ele = arr[i];
            int index = ele - min ;
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
            int ele = arr[i];
            int index = ele - min;
            int val = prefix[index] - 1;
            ans[val] = ele;
            prefix[index] -= 1;
        }

        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = ans[i];
        }

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr,min,max);
        print(arr);
    }
}

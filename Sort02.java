package com.datastructures.Sorting;

import java.util.Scanner;
//1. You are given an array(arr) containing only 0's, 1's, and 2's.
//2. You have to sort the given array in increasing order and in linear time.

public class Sort02 {
    public static void sort012(int[] arr){
        int left =0;
        int right = arr.length -1;
        int i = 0;

        while(i <= right)
        {
            if(arr[i] == 1)
            {
                i++;
            }
            else if(arr[i] == 0)
            {
                swap(arr,i , left);
                left++;
                i++;
            }
            else if(arr[i] == 2)
            {
                swap(arr,i , right);
                right --;
                // i++ wrong
            }
        }
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n; i++){
            arr[i] = scn.nextInt();
        }
        sort012(arr);
        print(arr);
    }
}

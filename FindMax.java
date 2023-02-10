package com.datastructures.array;

/*
Problem statement#
Given an integer array, return the maximum subarray sum. The array may contain both positive and negative integers and is unsorted.

Method Prototype#
int findMaxSumSubArray(int[] arr)
Output#
An integer value equal to the maximum sum of subarray found in arr.

Sample Input#
arr = {1, 7, -2, -5, 10, -1}
Sample Output#
11
 */

public class FindMax {
    public static int findMaxSum(int[] arr)
    {
        int currMax = arr[0];
        int globalMax = arr[0];
        for(int i = 0; i< arr.length ; i++)
        {
            if(currMax < 0)
            {
                currMax = arr[i];
            }else
            {
                currMax += arr[i];
            }

            if(globalMax < currMax)
            {
                globalMax = currMax;
            }
        }
        return globalMax;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 7, -2, -5, 10, -1};
        for(int i =0 ; i<arr1.length ; i++)
        {
            System.out.println("Arrays: " + arr1[i]);
        }
        System.out.println("Sum: " + findMaxSum(arr1));
    }
}

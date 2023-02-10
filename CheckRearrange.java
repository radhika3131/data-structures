package com.datastructures.array;
/*
Problem Statement#
In this problem, you have to implement the void reArrange(int[] arr) method, which will sort the elements, such that all the negative elements appear at the left and positive elements appear at the right.

Note: Consider 0 as a positive number.

Method Prototype#
void reArrange(int[] arr)
Output#
A sorted array with negative elements at the left and positive elements at the right.

Sample Input#
arr = {10, -1, 20, 4, 5, -9, -6}
Sample Output#
arr = {-1, -9, -6, 10, 20, 4, 5}
Note: Order of the numbers doesn’t matter.

{-1, -9, -6, 10, 20, 4, 5} = {-9, -1, -6, 10, 4, 20, 5}
 */
public class CheckRearrange {
    public static void reArrange(int[] arr)
    {
        // creating new array
        int[] resultArray = new int[arr.length];
        int resultArrIndex = 0;

        // traversing through the array .... first for storing negative values
        // in new array
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] < 0)
            {
                resultArray[resultArrIndex++] = arr[i++];
            }
        }
        // traversing through the array ....  for storing positive values
        // in new array
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] >= 0)
            {
                resultArray[resultArrIndex++] = arr[i++];
            }
        }
        for (int j = 0; j < resultArray.length; j++) {
            arr[j] = resultArray[j];
        }

    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println("Array Before Rearrangement\n:");
        for (int i = 0 ; i< arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
        reArrange(arr);
        System.out.println("Array After Rearrangement\n:");
        for (int i = 0 ; i< arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
/*
Time Complexity#
Since the given array is iterated over thrice in non-nested loops, the time complexity of this solution is O(n)
O(n)
. Space complexity increased in this case as the new array is created.
 */

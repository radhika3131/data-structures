package com.datastructures.array;
/*
Problem Statement#
In this problem, you have to implement the int findMinimum(int[] arr) method, which will traverse the whole array and find the smallest number in the array.

Method Prototype#
int findMinimum(int[] arr)
Output#
The smallest number in the array.

Sample Input#
arr = {9, 2, 3, 6}
Sample Output#
2
 */
public class CheckMinimum {
    public static int findMinimum(int[] arr)
    {
        int mini = arr[0];
        for(int i = 0;i < arr.length ; i++ )
        {
            if(arr[i] < mini )
            {
                mini = arr[i];
            }
        }
        return mini;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,6};
        System.out.println("Array1 Before finding minimum value!");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int mini_value = findMinimum(arr);
        System.out.println("Minimum Value in the array" + mini_value);
    }

}

package com.datastructures.array;
/*
Problem Statement#
In this problem, you have to implement the void rotateArray(int[] arr) method, which takes an arr and rotate it right by 1. This means that the right-most elements will appear at the left-most position in the array.

Method Prototype#
void rotateArray(int[] arr)
Output#
Array rotated by one element from right to left

Sample Input#
arr = {1, 2, 3, 4, 5}
Sample Output#
arr = {5, 1, 2, 3, 4}
 */
public class CheckRotatearray {
    public static void rotateArray(int[] arr)
    {
        int lastelement = arr[arr.length - 1];
        int n = arr.length;
        for (int i = n -1   ; i >0 ; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = lastelement;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println("Array Before Rotation :");
        for (int i = 0 ; i< arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
        rotateArray(arr);
        System.out.println("Array After Rotation :");
        for (int i = 0 ; i< arr.length ; i++)
        {
            System.out.println(arr[i]);
        }

    }

}
//Time Complexity#
//Since the entire array is iterated over once, the time complexity of this solution is O(n)
//O(n)
//.

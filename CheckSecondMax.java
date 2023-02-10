package com.datastructures.array;

/*
Problem Statement#
In this problem, you have to implement the int findSecondMaximum(int[] arr) method, which will traverse the whole array and return the second largest element present in the array.

Assumption: Array should contain at least two unique elements.

Method Prototype#
int findSecondMaximum(int[] arr)
Output#
Second largest element present in the array.

Sample Input#
arr = {9,2,3,6}
Sample Output#
6
 */
public class CheckSecondMax {
    public static int findSecondMaximum(int[] arr)
    {
        // assigning mini values to max and SeconMaximum
    int max = Integer.MIN_VALUE;
    int secondMaximum = Integer.MIN_VALUE;

    // Traversing through the array and then comaring the element of array with max
    //if the  element is greater then max
    // update max
        for(int i = 0; i<arr.length;i++)
    {
        if(arr[i] > max)
            max = arr[i];
    }
    // Find the second maximum value by comparing each index with secondmax
    // If an element is greater than secondmax and not equal to previously
    // calculated max, then update secondmax to be equal to that element.
        for( int i = 0;i<arr.length;i++)
    {
        if(arr[i] > secondMaximum && arr[i] < max)
            secondMaximum = arr[i];
    }
        return secondMaximum;
}

    public static void main(String[] args) {
        int[] arr = {5,3,2,1,6};
        for(int i = 0; i<arr.length;i++)
        {
            System.out.println("Array : " +arr[i]);
        }
        int secondMaximum = findSecondMaximum(arr);
        System.out.println("Second Maximum element in the array is :" +secondMaximum);
    }
}
/*
Time Complexity#
The time complexity of the solution is in O(n)
O(n)
 since the array is traversed twice but in separate loops. Which means O(n + n) \Rightarrow O(n)
O(n+n)⇒O(n)
 */
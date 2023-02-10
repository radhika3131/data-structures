package com.datastructures.array;
/*
Problem Statement#
In this problem, you have to implement the void maxMin(int[] arr) method. This will re-arrange the elements of a sorted array in such a way that the first position will have the largest number, the second will have the smallest, the third will have the second-largest, and so on.

Note: The given array is sorted in ascending order.

Note: The range of integers in the array can be from 0 to 10000.

Method Prototype#
void maxMin(int[] arr)
Output#
An array in which elements are stored in a max/min form.

Sample Input#
arr = {1, 2, 3, 4, 5}
Sample Output#
arr = {5, 1, 4, 2, 3}
 */
public class CheckMaxMin {
    public static void maxMin(int[] arr)
    {
        int[] result = new int[arr.length];
        int largePointer = arr.length - 1;
        int smallPointer = 0;

        // with the help of this pointer we will be able  to switch between largePointer and smallPointer
        boolean switchPointer = true;
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(switchPointer)
            {
                result[i] = arr[largePointer--];
            }
            else
            {
                result[i] = arr[smallPointer++];
            }
           switchPointer =! switchPointer;// switching between samll and large
        }
        for(int j = 0 ; j<arr.length ; j++)
        {
            arr[j] = result[j]; // copying to original array
        }
    }

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("Array before min/max: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        maxMin(arr);

        System.out.print("Array after min/max: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
//Time Complexity#
//The time complexity of this problem is O(n)
//O(n)
// as the array is iterated over once.

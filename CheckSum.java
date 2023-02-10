package com.datastructures.array;

/**
 * Problem Statement#
 * In this problem, you have to implement the int[] findSum(int[] arr, int n) method, which will take a number n, and an array arr as input and returns an array of two integers that add up to n in an array. You are required to return only one such pair. If no such pair is found then simply return the array.
 *
 * Method Prototype#
 * int[] findSum(int[] arr, int n)
 * Output#
 * An array with two integers a and b that add up to a given number or the original array in case a pair is not found.
 *
 * Sample Input#
 * arr = {1, 21, 3, 14, 5, 60, 7, 6}
 * value = 27
 * Sample Output#
 * arr = {21, 6} or {6, 21}
 */
public class CheckSum {
    public static int[] findSum(int[] arr1 , int n)
    {
        int[] result = new int[2];

        for(int i = 0 ; i < arr1.length ; i++)
        {
            for(int j = 0 ; j < arr1.length; j++)
            {
                if( arr1[i] + arr1[j] == n)
                {
                    result[0] = arr1[i];
                    result[1] = arr1[j];
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 21, 3, 14, 5, 60, 7, 6};
        int n = 27;
        System.out.println("Array1 Before Sum!");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        if(arr1.length > 0)
        {
            int[] arr2 = findSum(arr1,n);
            int num1 = arr2[0];
            int num2 = arr2[1];
            if((num1 + num2) != n)
                System.out.println("Not Found");
            else {
                System.out.println("Number 1 = " + num1);
                System.out.println("Number 2 = " + num2);
                System.out.println("Sum = " +  (n) );

            }

        }
        else {
            System.out.println("Input Array is Empty!");
        }


    }

}

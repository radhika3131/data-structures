package com.datastructures.array;

import java.util.Scanner;

/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.
			*
			*
			*	*
			*	*
*			*	*
*			*	*
*	*		*	*
 */
public class BarChart {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i =0; i<n ; i++)
        {
            max = Math.max(max,arr[i]);
        }

        for(int height = max ; height >=1 ; height--)
        {
            for(int i = 0; i<n ; i++)
            {
                if(arr[i] >= height)
                {
                    System.out.println("*\t");
                }
                else
                {
                    System.out.println(" ");
                }
            }
        }
        System.out.println();
    }
}

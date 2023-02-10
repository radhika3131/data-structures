package com.datastructures.Sorting;

public class Insertionsort {
    public static void swap(int[] arr , int index1 , int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void insertionsort(int[] arr)
    {
        int n = arr.length;
        for(int i =0 ; i<n-1; i++)
        {
            int ele = arr[i];
            int j = i-1;
            while( j >= 0 && ele<arr[j])
            {
                swap(arr , j+1 , j);
                j--;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {5,100,4,10,6, 2};
        insertionsort(arr);

        int n = arr.length;
        for(int i =0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}

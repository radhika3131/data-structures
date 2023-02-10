package com.datastructures.Sorting;

public class Selectionsort {

    public static void selectionsort(int[] arr)
    {
        int n = arr.length;
        for(int i =0 ; i<n-1; i++)
        {
            int min_ele = arr[i];
            int min_index = i;
            for(int j =0 ; j<n ; j++)
            {

                if(arr[j] < arr[min_index])
                {
                    min_index = j;
                    min_ele = arr[j];
                }


            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {5,100,4,10,6, 2};
        selectionsort(arr);

        int n = arr.length;
        for(int i =0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}

package com.datastructures.array;
/*
Problem Statement#
In this problem, you have to implement the int findFirstUnique(int[] arr) method that will look for a first unique integer, which appears only once in the whole array. The function returns -1 if no unique number is found.

Method Prototype#
int findFirstUnique(int[] arr)
Output#
The first unique element in the array.

Sample Input#
arr = {9, 2, 3, 2, 6, 6}
Sample Output#
9
 */
public class CheckFirstUnique {
    public static int findFirstUnique(int[] arr)
    {
        boolean isRepeated = false;
        for(int i =0 ; i < arr.length;i++)
        {
            for(int j = 0 ; j < arr.length; j++)
            {
                if(arr[i] == arr[j] && i != j)
                {
                    isRepeated = true;
                    break;
                }
            }
            if(isRepeated == false)
            {
                return arr[i];
            }else
            {
                isRepeated = false;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,54,7,2,6,54};
        for (int i =0 ; i < arr.length;i++)
        {
            System.out.println("Array is: " + arr[i]);
        }
        int unique = findFirstUnique(arr);
        System.out.println("First unique in an array : " +unique);
    }

}

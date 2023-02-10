package com.datastructures.FunctionsAndArray;

import java.util.Scanner;
/*
1.You are given a number n, representing the size of array a.
2.You are given n distinct numbers, representing elements of array a.
3. You are given another number d.
4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.
 */
public class FindNumber {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (d == arr[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

    }
}

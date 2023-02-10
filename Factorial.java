package com.datastructures.Recurssion;

import java.util.Scanner;

/*
1. You are given a number n.
2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

 */
public class Factorial {
    public static void main  (String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = factorial(n);
        System.out.println(f);
    }

    public static int  factorial(int n){
        if(n==0)
        {
            return 1;
        }

        int fact =  factorial(n-1);
        int val = n * fact;
        return val;
    }
}

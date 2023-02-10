package com.datastructures.Recurssion;

import java.util.Scanner;

/*
1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function .
 */
public class PowerLiner {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int p = power(x, n);
        System.out.println(p);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int val = power(x, n - 1);
        return val * x;
    }
}


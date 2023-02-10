package com.datastructures.FunctionsAndArray;

import java.util.Scanner;

/*
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to subtract n1 from n2 and print the value.
 */
public class AnyBasrSubstraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2){
        // write your code here
        int ans = 0;
        int borrow = 0;
        int multiplier = 1;
        while(n2!=0)
        {
            int l1 = n2%10;
            int l2 = n1%10;
            l1 = l1 - borrow;
            if(l1<l2)
            {
                borrow = 1;
                l1 = l1 + b;

            }
            else
            {
                borrow = 0;
            }
            int digit = l1 - l2;
            ans += multiplier*digit;
            multiplier *= 10;

            n1 = n1/10;
            n2 = n2/10;
        }
        return ans;
    }
}

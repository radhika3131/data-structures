package com.datastructures.gettingstarted;
/*
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        // write your code here

        int n = 5;
        int a  =0;
        int b = 1;
        System.out.print(a+" "+b);
        for (int i = 2 ; i< n ; i++)
        {
            int c = a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}

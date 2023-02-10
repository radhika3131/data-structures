package com.datastructures.FunctionsAndArray;

import java.util.Scanner;

/*
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to add the two numbes and print their value in base b.
 */
public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2){
        // write ur code here

        int carry = 0;
        int multiplier = 1;
        int result = 0;
        while(n1!=0 || n2!= 0 || carry != 0)
        {
            // last digit
            int t1 = n1%10;
            int t2 = n2%10;
            //finding sum
            int intial_sum = t1 + t2 +carry;
            // finding digit
            int digit = intial_sum % b;
            // finding carry
            carry = intial_sum/b;
            result += multiplier * digit;
            multiplier *= 10;
            // removal of last digit
            n1 /= 10;
            n2 /= 10;
        }
        return result;
    }
}

package com.datastructures.gettingstarted;

import java.util.Scanner;
/*
1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.
 */
public class Countdigit {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Digit_count = 0;
        while(num!=0)
        {
            num = num /10;
            Digit_count++;
        }
        System.out.println( Digit_count);
    }
}

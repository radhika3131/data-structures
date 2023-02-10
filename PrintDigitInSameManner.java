package com.datastructures.gettingstarted;

/*
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
        3. Print the digits of the number line-wise.
 */

import java.util.Scanner;

public class PrintDigitInSameManner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int length =0;

        while(n!=0)
        {
            n = n/10;
            length++;
        }
        n = temp ;
        int power = (int)Math.pow(10,length-1);
        while(power>0)
        {
            int result = n/power;
            n = n%power;
            power = power/10;
            System.out.println(result);
        }
    }
}

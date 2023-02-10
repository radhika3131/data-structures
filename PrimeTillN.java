package com.datastructures.gettingstarted;

import java.util.Scanner;

/*
1. You've to print all prime numbers between a range.
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).
 */
public class PrimeTillN {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int High = sc.nextInt();


        for( int n = low ; n <= High ; n++)
        {
            int factor = 0;
            for(int i =2; i*i<= n ; i++)
            {
                if(n%i ==0)
                {
                    factor++;
                    break;
                }
            }

            if(factor == 0)
            {
                System.out.println(n);
            }

        }
    }
}

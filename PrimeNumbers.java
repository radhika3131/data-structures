package com.datastructures.gettingstarted;
/*
to check is a number prime or not
 */
public class PrimeNumbers {
    public static void main(String[] args)
    {
        int n=5;
        int factor = 0;
        for(int i = 2 ; i*i<=n ; i++)
        {
            if(n%i == 0)
                // means i is a factor of n
                factor++;
        }
        if(factor > 0)
        {
            System.out.println("Not Prime");
            System.out.println(factor);
        }
        else
        {
            System.out.println(" Prime");
        }


    }
}

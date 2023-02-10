package com.datastructures.gettingstarted;

public class ReverseDigit {
    public static void main(String[] args) {
        // write your code here

        int n = 2453;
        int temp = n;
        int length =0;
        while(n!=0)
        {
            n = n/10;
            length++;
        }
        n= temp;
        int power = (int)(Math.pow(10,length -1));
        int rev = 0;
        while(n!=0)
        {
            int rem = n%10;
            rev = rev + power*rem;
            power = power / 10;
            n = n/10;

        }

        System.out.println(rev);
    }
}

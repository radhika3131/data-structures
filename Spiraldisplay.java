package com.datastructures.array2d;

import java.util.Scanner;

/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.
 */
public class Spiraldisplay {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int row1 = scn.nextInt();
        int col1 = scn.nextInt();

        int[][] arr = new int[row1][col1];
        for(int i = 0; i< row1 ; i++)
        {
            for(int j = 0; j<col1; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        int sr = 0;
        int sc = 0;
        int er = arr.length -1;
        int ec = arr[0].length -1;

        int n = arr.length;
        int m = arr[0].length;

        int count = 0;

        while(count < n*m)
        {

            // first loop up to down

            for( int i = sr; i<=er&&count<n*m ; i++)
            {
                System.out.println(arr[i][sc]);
                count++;
            }

            // second loop left to right

            for(int i = sc+1 ; i<=ec&& count <n*m; i++)
            {
                System.out.println(arr[er][i]);
                count++;
            }

            //Third loop down to up

            for(int i = er -1;i>=sr&& count <n*m; i--)
            {
                System.out.println(arr[i][ec]);
                count++;
            }

            //fourth loop right to left

            for(int i = ec-1; i>=sc+1&&count < n*m; i--)
            {
                System.out.println(arr[sr][i]);
                count++;
            }

            sr++;
            er--;
            sc++;
            ec--;

        }

    }
}

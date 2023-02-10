package com.datastructures.array2d;

/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.3
 */
import java.util.Scanner;

public class ExitPointOFMatrix {
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

        int dir = 0;
        int n = arr.length;
        int m = arr[0].length;

        int row =0;
        int col = 0;

        while(true)
        {
            dir = (dir + arr[row][col])%4;

            if(dir ==0)
            {
                col++;
            }
            else if(dir == 1)
            {
                row++;
            }
            else if(dir == 2)
            {
                col--;
            }
            else if(dir == 3)
            {
                row--;
            }

            if(row<0)
            {
                row++;
                break;
            }
            else if(col<0)
            {
                col++;
                break;
            }
            else if(row>=n)
            {
                row--;
                break;
            }
            else if(col>=n)
            {
                col--;
                break;
            }

        }
        System.out.println(row);
        System.out.println(col);

    }
}

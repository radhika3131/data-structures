package com.datastructures.array2d;

public class TransposeOfMatrix {
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = arr.length;
        int m = arr[0].length;



        for(int i =0; i<n;i++)
        {
            for(int j =i ; j<m ;j++)
            {
                int temp = arr[i][j];
                arr[j][i] = arr[i][j];
                arr[j][i] = temp;

            }
        }

        for(int i =0; i<n;i++)
        {
            for(int j =0 ; j<m ;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }

}

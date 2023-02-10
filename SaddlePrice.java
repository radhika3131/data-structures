package com.datastructures.array2d;
/*
1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix.
2. You are required to find the saddle price of the given matrix and print the saddle price.
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
 */
import java.util.Scanner;

public class SaddlePrice {
    public static int returnColIndexWithMinValue(int[][] arr , int row){

        int colIndex = 0;
        int minValue = Integer.MAX_VALUE;

        for(int col=0; col<arr[0].length; col++){

            if(arr[row][col] < minValue ){
                minValue = arr[row][col];
                colIndex = col;
            }

        }

        return colIndex;

    }

    public static boolean checkIsBiggestOrNot( int[][] arr , int row , int col ){

        for(int i=0; i<arr.length; i++){

            if(arr[i][col] > arr[row][col]){
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        for(int i=0 ; i<n; i++){
            for(int j=0 ; j<n ;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int row=0 ; row<n ; row++){

            int colIndex = returnColIndexWithMinValue(arr , row);

            if(checkIsBiggestOrNot(arr , row ,colIndex) == true){
                System.out.println(arr[row][colIndex]);
                return;
            }

        }


        System.out.println("Invalid input");



    }
}

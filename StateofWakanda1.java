package com.datastructures.array2d;


import java.util.Scanner;

public class StateofWakanda1 {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int col=0 ; col<arr[0].length; col++ ){

            if(col%2 == 0){

                for(int row=0 ; row<arr.length; row++){
                    System.out.println(arr[row][col]);
                }

            }else{

                for(int row=arr.length-1 ; row>=0; row--){
                    System.out.println(arr[row][col]);
                }


            }

        }




    }
}

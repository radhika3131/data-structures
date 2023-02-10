package com.datastructures.array2d;
/*
You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.
You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.
 */
import java.util.Scanner;

public class RingRotate {
    public static void reverse(int[] arr , int a , int b){

        int n = arr.length;

        while(a<b){

            // swap

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            //pointers change
            a++;
            b--;

        }

    }


    public static void rotate(int[] arr, int k){

        int n =arr.length;

        k = k%n;
        if(k < 0){
            k = k+n;
        }

        reverse(arr , 0 , n-k-1);
        reverse(arr , n-k , n-1);
        reverse(arr , 0 , n-1);

    }

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();


        int sr = 0;
        int sc = 0;
        int er = n-1;
        int ec = m-1;

        // to move over Sth spiral we need to perform s-1 no of operation

        sr = sr + 1*(s-1);
        sc = sc + 1*(s-1);
        er = er - 1*(s-1);
        ec = ec - 1*(s-1);

        // getting the size of store array ( b-a+1 )

        int size = (er-sr+1) + (ec - (sc+1) +1) + ((er-1) - sr + 1) + ( (ec-1)-(sc+1)+1 ) ;
        int[] store = new int[size];

        int index = 0;

        // below 4 loops are used to store the values from my array arr // store <-- arr

        for(int i=sr; i<=er; i++){

            store[index] = arr[i][sc];
            index++;

        }

        for(int i=sc+1 ; i<=ec; i++){
            store[index] = arr[er][i];
            index++;
        }

        for(int i=er-1 ; i>=sr; i--){
            store[index] = arr[i][ec];
            index++;
        }

        for(int i=ec-1; i>= sc+1 ; i--){
            store[index] = arr[sr][i];
            index++;
        }

        // rotate the store array r no of times

        rotate( store , r );
        index = 0;

        // below 4 llops are storing the values from store array to arr // store --> arr

        for(int i=sr; i<=er; i++){

            arr[i][sc] = store[index];
            index++;

        }

        for(int i=sc+1 ; i<=ec; i++){
            arr[er][i] = store[index] ;
            index++;
        }

        for(int i=er-1 ; i>=sr; i--){
            arr[i][ec] = store[index];
            index++;
        }

        for(int i=ec-1; i>= sc+1 ; i--){
            arr[sr][i] = store[index];
            index++;
        }

        // displaying the final 2d array arr

        display(arr);





    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

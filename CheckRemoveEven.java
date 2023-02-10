package com.datastructures.array;

/**
 * Problem Statement#
 * In this problem, you have to implement the int [] removeEven(int[] arr) method, which removes all the even elements from the array and returns back updated array.
 *
 *
 * Method Prototype#
 * int[] removeEven(int[] arr);
 * Input#
 * An array with integers.
 *
 * Output#
 * An array with only odd integers.
 *
 * Sample Input#
 * arr = {1, 2, 4, 5, 10, 6, 3}
 *
 * Sample Output#
 * arr = {1, 5, 3}
 */
 class CheckRemoveEven {
    public static int[] removeEven(int[] arr) {
        int oddelements = 0;
        // counting number of odd elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                oddelements++;
        }

        // creating one result with the size equal to number of oddelements
        int[] result = new int[oddelements];

        // now pushing odd values from array into result array
        int result_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[result_index++] = arr[i];
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 10, 6, 3};
        System.out.println("Array Before removing any even element!");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        int[] newarr = removeEven(arr);
        System.out.print("After removing Even Numbers: ");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}




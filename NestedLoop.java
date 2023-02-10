package com.datastructures.complexity;

/**
 * we will learn how to compute the time complexity of an algorithm that involves nested for loops.
 */
public class NestedLoop {
    public static void main(String[] args) {
        int n = 5; // 1 step
        int m = 7; // 1 step
        int sum = 0; // 1 step
        for (int i = 0; i < n; i++) { // n steps
            for (int j = 0; j < m; j++) { // n*m steps
                sum++; // n*m steps
            }
        }
        System.out.println("Sum: " + sum); // 1 step
    }
}
/**
 * time Complexity =1+1+1+6n+4+n(6m+4)+3nm+2
 *
 * \Downarrow\
 * ⇓
 *
 * 3+6n+4+6nm + 4n+3nm+2
 * 3+6n+4+6nm+4n+3nm+2
 *
 * \Downarrow\
 * ⇓
 *
 * 9nm + 10n + 9
 * 9nm+10n+9
 *
 * Let’s take the training wheels off and jump straight to line number 6. From the previous lesson, you would recall that it accounts for 6n + 4
 * 6n+4
 *  primitive operations: one for initialization, 3\times(n + 1)
 * 3×(n+1)
 *  for the comparison, and 3\times n
 * 3×n
 *  for the increment.
 *
 * Let’s move onto line number 7. Since this line is nested inside the for loop on line 6, it is repeated n
 * n
 *  times. For a single iteration of the outer for loop, how many primitive operations does this line incur? You should be able to generalize from the last lesson that the answer is 6m + 4
 * 6m+4
 * . That means that the total number of primitive operations on line 7 are n ( 6m + 4 )
 * n(6m+4)
 * .
 *
 * How about line number 8? Each time it is executed, it involves reading a variable’s value, adding two numbers, and assigning to a variable - that’s three primitive operations. Since. this line is nested inside the two loops, it is repeating n * m
 * n∗m
 *  times. So, the total number of primitive operations contributed by line 8 are 3nm
 * 3nm
 * . Lines 11 is executed only once and account for two primitive operations.
 */

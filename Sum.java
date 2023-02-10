package com.datastructures.complexity;

/**
 * we are going to learn how to compute the time complexity
 * of an algorithm that involves a for loop.
 */

public class Sum {
    public static void main(String args[]) {

        int n = 10; // 1 step...line 4 --- operations ---1
        int sum = 0; // 1 step...line 5 ---- operation --- 1
        for (int i = 0; i < n; i++) { // line 6 --- operations ----6n + 4
            sum += 1; // n steps ...line 7 ...operations ---- 3n
        }
        System.out.println(sum); // 1 step --- line 9 ..operation ---2

    }
}
/**
 * Time Complexity = 1 + 1 + 6n + 4 + 3n + 2 ⇒9n+8
 * Let’s count the number of primitive operations in the above program. Let’s come to lines 4 and 5 where variable initializations are taking place, which account for one primitive operation, each.
 *
 * Line 6 is a loop statement. To count the number of primitive operations on that line, we must dissect it into its constituents: the initialization, the increment, and the test. The initialization occurs only once and is counted as one primitive operation. The increment (i++
 * i++
 * ) operation must read the current value of variable i
 * i
 * , add 1
 * 1
 *  to it and store the result back in variable i
 * i
 * . That’s three primitive operations. The test operation (i < n
 * i<n
 * ) must read the current value of the variables i
 * i
 *  and n
 * n
 * , then compare them. So, that’s three primitive operations as well.
 *
 * Unlike the initialization in the loop, the increment and test parts are repeated in the iterations of the for loop. The comparison is performed n + 1
 * n+1
 *  times, with the loop index at i = 0, 1, 2, \cdots , n
 * i=0,1,2,⋯,n
 * . The increment operation, on the other hand, is performed n
 * n
 *  times, when the loop index is at i = 0, 1, 2, \cdots, n - 1
 * i=0,1,2,⋯,n−1
 * . When the index i
 * i
 *  reaches n
 * n
 * , the loop terminates, and the increment is not performed. Thus, line 6 accounts for a total of 1 + 3\times( n + 1 ) + 3\times n = 6n + 4
 * 1+3×(n+1)+3×n=6n+4
 *  primitive operations.
 *
 * Line 7 involves reading a variable’s value, adding two integers, and assigning the result to a variable: 3 primitive operations. This line is repeated n
 * n
 *  times since the loop is entered when index i = 0, 1, 2,\cdots , n - 1
 * i=0,1,2,⋯,n−1
 * . Thus, line 7 accounts for 3n primitive operations. Line 9 accounts for two primitive operations.
 */

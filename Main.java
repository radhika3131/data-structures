package com.datastructures.complexity;

/**
 * The running time of an algorithm computed in the aforementioned way is also known as its time complexity.
 * Another term that you will often hear is an algorithm’s space complexity.
 * The space complexity of an algorithm is the amount of additional or
 * auxiliary memory space that the algorithm requires. This is memory space other than the actual input itself
 */

public class Main {
    public static void main(String args[]) {

        int x = 0;//Variable assignment--- no of primitive operation 1
        x += 1;//Variable access, addition, variable assignment---3
        System.out.println(x);//Variable access, display value--2
    }
}
/**Let’s analyze the main() function.
 * There is a variable assignment on line number 5, so that’s 1 primitive operation.
 * A variable’s value is accessed, an addition is performed,
 * and then an assignment takes place on line 6,
 * so that’s three primitive operations. A variable’s value is accessed and then displayed on line 7,
 * so that’s two primitive operations.
 * So, overall there are 6 primitive operations in the above program.
 *Time Complexity = 1 + 3 + 2⇒6
 * Note that there is no notion of input size in this simple example since there is no input to this program.
 * Algorithms for which the time complexity is independent of
 * the input size are known as constant-time algorithms.
 */

/**
 * We assume a hypothetical computer on which some primitive operations are executed in a constant amount of time.
 * We consider a specific input size, say, n. We then count the number of primitive operations executed by an algorithm for a given input.
 * The algorithm that results in fewer primitive operations is considered better.
 *
 * What constitutes a primitive operation, though?
 * You can think of these as simple operations that are typically implemented as processor instructions.
 * These operations include assignment to a variable or array index, reading from a variable or array index,
 * comparing two values, arithmetic operations, a function call, etc.
 *
 * What is not considered a primitive operation? Consider a function call, for instance. When a function is called,
 * all the statements in that function are executed.
 * So, we can’t consider each function invocation as a single primitive operation. Similarly, displaying an entire array is not a primitive operation.
 */

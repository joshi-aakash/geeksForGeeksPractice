/*
Bit-wise operators are used to perform manipulation of individual bits of a number. They can be used with any of
the integral types (char, short, int, etc). They are used when performing update and query operations of Binary
indexed tree.

This operator is binary operator, denoted by ‘^’. It returns bit by bit XOR of input values, i.e, if
corresponding
bits are different, it gives 1, else it gives 0.
Illustration:

a = 5 = 0101 (In Binary)
b = 7 = 0111 (In Binary)

Bitwise XOR Operation of 5 and 7
  0101
^ 0111
 ________
  0010  = 2 (In decimal)
This is the most optimal method as here directly computations are carried on over bits instead of bytes as seen
in above two methods. Here’s a Java program to show internal working –

 */
package BasicPrograms;

public class swapValueUsingOperator {
    // Function to swap values of two numbers
    // using XOR operator
    static void swapValuesUsingXOROperator(int m, int n)
    {
        // Logic of XOR operator
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;

        System.out.println("Value of m is " + m
                + " and Value of n is " + n);
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Random two integer numbers
        // to get swapped
        int m = 9, n = 5;

        // Calling the function in main method
        // to get above integer numbers swapped
        swapValuesUsingXOROperator(m, n);
    }
}

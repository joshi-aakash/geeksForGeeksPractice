/*
There are 3 standard steps as listed below:

1. Difference of second number from the first number is stored in memory cell where first number was already stored.
2. Sum of both the numbers  is stored in second memory cell(number).
3. Difference of first number from the second is computed and stored in memory cell where at initial first value was
stored.
 */

package BasicPrograms;

import java.util.Scanner;

public class swapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        System.out.println("Enter B");
        int b = sc.nextInt();
        System.out.println("Valur before swap A = " + a + "B = "+b);

        //Swap
        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("Value after swap A = " + a + "B = " + b);
    }
}

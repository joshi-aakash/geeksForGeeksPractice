/*
A memory cell will be created in the memory of the same type occupying same memory in stack area of memory.
During execution, it holds on one value to replace others values, once desired execution is completed its value
is assigned to already existing second variable. Once scope for the variables are three variables are released
from memory cell. This variable is called temporary variable or sometimes referred as catalyst as the involvement
in output is not even traced out but executions will halt to produce desired result above witnessed.
 */
package BasicPrograms;

import java.util.Scanner;

public class swapTwoNumberUsingThirdV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A");
        int a = sc.nextInt();
        System.out.println("Enter B");
        int b = sc.nextInt();
        int temp;

        temp = b;
        b = a;
        a = temp;

        System.out.println("After swapping = " + "a " + a  + " b= " + b);
    }
}

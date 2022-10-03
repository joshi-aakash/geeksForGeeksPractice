//Java Program to Read The Number From Standard Input

package BasicPrograms;
import java.util.Scanner;

public class printIntegerValue {
    public static void main(String[] args) {
        System.out.println("Enter an Integer value");
        Scanner sc =  new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("You have entered " + i);
    }
}

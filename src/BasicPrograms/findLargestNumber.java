package BasicPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Java Program to Find the Largest of three Numbers
public class findLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        int a = sc.nextInt();
        System.out.println("Enter value of B");
        int b = sc.nextInt();
        System.out.println("Enter value of C");
        int c = sc.nextInt();

        //using collection().max

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);

        System.out.println(Collections.max(arrayList) + " is the largest number");
//        if(a > b && a > c){
//            System.out.println("A is the largest number");
//        } else if (b > c && b > a) {
//            System.out.println("B is the largest number");
//        }else {
//            System.out.println("C is the largest number");
//        }
    }
}

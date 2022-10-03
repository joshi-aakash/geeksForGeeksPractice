package BasicPrograms;
//Java Program to Display All Prime Numbers from 1 to N

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
       int min, max, flag = 0;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the min value");
        min = sc.nextInt();
        System.out.println("Enter the max value");
        max = sc.nextInt();

        for (int i = min; i<=max; i++){
            for (int j = 2; j<i; j++){
                if (i%j == 0){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.print(i + " ");
            }
            flag = 0;
        }
    }
}

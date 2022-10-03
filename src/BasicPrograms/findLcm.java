package BasicPrograms;
/*
LCM (i.e. Least Common Multiple) is the largest of the two stated numbers that can be divided by both the given
numbers.
firstly find all the prime factors of both the stated numbers, then find the union of all those factors that are
present in both the given numbers. And at last, return the product of elements which are in union.
 */
public class findLcm {

    //Method to find GCD
    public static int GCD(int a, int b){
        if ( a == 0) return b;
        return GCD(b % a, a);
    }

    //LCM of two numbers
    static int LCM(int a, int b){
        return (a / GCD (a, b)) * b;
    }
    public static void main(String[] args) {
       int a = 25, b=15;
        System.out.println("LCM of " + a + " and" + b + " is" + LCM(a, b));
    }
}

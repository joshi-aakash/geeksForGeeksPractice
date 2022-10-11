package BasicPrograms;

public class findFactorial {
        int factorial(int number){
          return (number == 1 || number == 0) ? 1 : number * factorial(number -1);
    }

    public static void main(String[] args) {
        findFactorial obj = new findFactorial();
        int n = 5;
        System.out.println(obj.factorial(n));
    }
}

package algorithms.day002;

import java.util.Scanner;

public class A007_FactorialCalculator {

    public static long factorialIterative (int number){
        if (number < 0) {
            throw  new IllegalArgumentException("Number must be non-negative");
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive (int number){
        if ( number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        if(number == 0 || number == 1) {
            return 1;
        }
        return number * factorialRecursive(number-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int input = scanner.nextInt();

        System.out.println("Iterative factorial: " + factorialIterative(input));
        System.out.println("Recursive factorial: " + factorialRecursive(input));

        scanner.close();
    }

}

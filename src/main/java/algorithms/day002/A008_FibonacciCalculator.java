package algorithms.day002;

import java.util.Scanner;

public class A008_FibonacciCalculator {


    // fib(n) = fib(n-1) + fib(n-2)
    public static int fibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static int fibonacciIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        int prev = 0, curr=1;
        for (int i = 2; i <= n; i++){
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n (position in Fibonacci series): ");
        int position = scanner.nextInt();

        System.out.println("Recursive Fibonacci at position " + position + ": " + fibonacciRecursive(position));
        System.out.println("Iterative Fibonacci at position " + position + ": " + fibonacciIterative(position));

        scanner.close();

    }
}

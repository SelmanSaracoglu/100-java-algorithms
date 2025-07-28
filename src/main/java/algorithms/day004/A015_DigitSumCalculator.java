package algorithms.day004;


import java.util.Scanner;

/*
Write a Java program to calculate the sum of digits of a non-negative integer.
Input: 1234
Output: 10 (1+2+3+4)
*/
public class A015_DigitSumCalculator {

    public static int sumOfDigits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Extract last digit
            number /= 10;       // Remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int input = scanner.nextInt();

        int result = sumOfDigits(input);
        System.out.println("Sum of digits: " + result);
    }
}

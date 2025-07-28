package algorithms.day004;

import java.util.Scanner;

/*
Write a Java program to reverse a given non-negative integer number.
Input: 1234 → Output: 4321
Input: 1000 → Output: 1
*/

public class A016_IntegerReverser {

    public static int reverse(int number){

        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        int reversed = 0;
        while (number>0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int input = scanner.nextInt();

        int reversed = reverse(input);
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }

}

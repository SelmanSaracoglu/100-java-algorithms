package algorithms.day003;

import java.util.Scanner;

public class A009_ArmstrongChecker {

    /*
    Write a program to check whether a number is an Armstrong number.
    An Armstrong number of n digits is an integer such that the sum of its digits each raised to the power n equals the number itself.
    153 → 1³ + 5³ + 3³ = 1 + 125 + 27 = 153
    */

    public static boolean isArmstrong(int number) {
        String digits = String.valueOf(number); // This is a static method from the String class that converts a value into a string.
        int n = digits.length();
        int sum = 0;

        for (char digitChar : digits.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            sum += Math.pow(digit, n);
        }

        return sum == number;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        if (isArmstrong(input)) {
            System.out.println(input + " is an Armstrong number.");
        }else {
            System.out.println(input + " is not an Armstrong number.");
        }
        scanner.close();
    }




}

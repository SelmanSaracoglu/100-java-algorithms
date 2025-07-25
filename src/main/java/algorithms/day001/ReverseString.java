package algorithms.day001;

import java.util.Scanner;

public class ReverseString {

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Word: ");
        String userInput= scanner.nextLine();

        String reversed= reverse(userInput);
        System.out.println("Reversed: " + reversed);

        scanner.close();
    }

}

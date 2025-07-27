package algorithms.day003;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


/*
Write a Java program to remove duplicate characters from a given string while maintaining the original order.
Input: "programming"
Output: "progamin"
 */
public class A011_DuplicateRemover {

    public static String removeDuplicates(String input){
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            seen.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : seen) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();

        String cleaned = removeDuplicates(userInput);
        System.out.println("Without duplicates: " + cleaned);

        scanner.close();
    }
}

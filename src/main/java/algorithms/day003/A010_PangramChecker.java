package algorithms.day003;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Write a Java program to check if a string is a pangram.
A pangram is a sentence that contains every letter of the alphabet at least once.
“The quick brown fox jumps over a lazy dog”
 */
public class A010_PangramChecker {

    public static boolean isPangram(String text) {
        Set<Character> alphabet = new HashSet<>();
        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                alphabet.add(c);
            }
        }
        return alphabet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("It's a pangram!");
        }else {
            System.out.println("Not a pangram.");
        }

        scanner.close();
    }
}

package algorithms.day001;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        String cleaned =input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Word or Phrase: ");
        String userInput = scanner.nextLine();

        if (isPalindrome(userInput)){
            System.out.println("✅ It's a palindrome!");
        }else {
            System.out.println("❌ Not a palindrome.");
        }

        scanner.close();
    }


}

package algorithms.day001;

import java.util.Scanner;

public class VowelCounter {

    public static int countVowels(String input) {
        String lower = input.toLowerCase();
        int count = 0;
        for (char c : lower.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String userInput = scanner.nextLine();

        int vowelCount = countVowels(userInput);
        System.out.println("Vowel count: " + vowelCount);

        scanner.close();
    }
}

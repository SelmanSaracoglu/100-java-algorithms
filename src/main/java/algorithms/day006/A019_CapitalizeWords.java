package algorithms.day006;


import java.util.Scanner;

/*
Write a Java program to capitalize the first letter of each word in a sentence.
Input: "java is awesome"
Output: "Java Is Awesome"
*/
public class A019_CapitalizeWords {

    public static String capitalizeEachWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return sentence;
        }

        String[] words = sentence.trim().split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    capitalized.append(word.substring(1).toLowerCase());
                }
                capitalized.append(" ");
            }
        }
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();

        String result = capitalizeEachWord(input);
        System.out.println("Capitalized: " + result);

        scanner.close();
    }
}

package algorithms.day006;

import java.util.Scanner;

public class A020_WordCounter {

    public static int countWords (String sentence) {
        if (sentence == null || sentence.trim().isEmpty()){
            return 0;
        }

        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();

        int count =countWords(input);
        System.out.println("Word count: " + count);

        scanner.close();
    }
}

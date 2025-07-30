package algorithms.day006;

import java.util.Scanner;

/*
Write a Java program to find the longest word in a given sentence.
Input: "Java is extraordinarily powerful"
Output: "extraordinarily"
*/

public class A021_LongestWordFinder {

    public static String findLongestWord(String sentence){
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        String[] words = sentence.trim().split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()){
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input =scanner.nextLine();

        String longest =findLongestWord(input);
        System.out.println("Longest word: " + longest);

        scanner.close();
    }

}

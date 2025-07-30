package algorithms.day005;


import java.util.Scanner;

/*
Write a Java program to reverse the words in a sentence. Not the characters, but the word order.
Input: "Java is fun"
Output: "fun is Java"
 */
public class A017_WordReverser {

    public static String reverseWords(String sentence) {

        if (sentence == null || sentence.trim().isEmpty()) {
            return sentence;
        }

        String[] words = sentence.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i --){
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }

    /*
    trim() + split("\\s+") → çoklu boşluklara karşı dayanıklı
    Son trim() son boşluğu temizliyor
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();

        String result = reverseWords(input);
        System.out.println("Reversed: " + result);

        scanner.close();
    }



}

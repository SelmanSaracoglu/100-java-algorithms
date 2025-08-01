package algorithms.day007;

/*
Write a Java program to replace all vowels in a string with the character *.
Input: "Java is fun"
Output: "J*v* *s f*n"
*/


import java.util.Scanner;

public class A022_ReplaceVowels {

    public static String replaceVowelsWithAsterisk(String input) {
        if (input == null) return null;
        return input.replaceAll("(?i)[aeiou]", "*");

        /*
        (?i) → case-insensitive regex
        [aeiou] → tüm sesli harfleri hedef alır
        replaceAll(...) ile tüm eşleşmeler * ile değiştirilir
         */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String result = replaceVowelsWithAsterisk(input);
        System.out.println("Result: " + result);
    }





}

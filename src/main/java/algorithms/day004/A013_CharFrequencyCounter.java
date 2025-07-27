package algorithms.day004;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Write a Java program to count the frequency of each character in a given string (case-insensitive).
Ignore spaces.
Input: "Programming"
Output: {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
 */
public class A013_CharFrequencyCounter {

    public static Map<Character, Integer> countFrequencies(String input) {
        Map<Character, Integer> freqMap = new HashMap<>();
        String cleaned = input.toLowerCase().replaceAll(" ", "");

        for ( char c : cleaned.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        return freqMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.nextLine();

        Map<Character, Integer> frequencies = countFrequencies(text);
        System.out.println("Character Frequencies: " + frequencies);

        scanner.close();
    }

}

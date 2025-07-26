package algorithms.day002;

import java.lang.reflect.Array;
import java.sql.PseudoColumnUsage;
import java.util.Arrays;
import java.util.Scanner;

public class A004_AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {

        char[] arr1 = str1.replaceAll("a-zA-Z", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("a-zA-Z", "").toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String input1 = scanner.nextLine();

        System.out.println("Enter second word: ");
        String input2 = scanner.nextLine();

        if (areAnagrams(input1, input2)) {
            System.out.println("They are anagrams.");
        } else {
            System.out.println("They are not anagrams.");
        }

        scanner.close();
    }
}

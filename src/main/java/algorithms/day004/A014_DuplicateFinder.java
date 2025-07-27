package algorithms.day004;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Write a Java program to find and return all duplicate values in an integer array.
Input: {4, 2, 7, 2, 4, 9, 1}
Output: [2, 4]
 */
public class A014_DuplicateFinder {

    public static Set<Integer> findDuplicates(int[] arr){
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by space: ");
        String[] input = scanner.nextLine().split(" ");

        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        Set<Integer> result = findDuplicates(numbers);
        System.out.println("Duplicate values: " + result);

        scanner.close();
    }

}

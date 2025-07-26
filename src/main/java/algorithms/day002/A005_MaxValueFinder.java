package algorithms.day002;

import java.util.Scanner;

public class A005_MaxValueFinder {

    public static int findMaxValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int max = arr[0];
        for (int num :  arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements seperated by space: ");
        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int max = findMaxValue(numbers);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }


}

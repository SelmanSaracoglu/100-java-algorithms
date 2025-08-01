package algorithms.day007;

import java.util.Scanner;
import java.util.regex.Pattern;

public class A023_RemoveCharacter {

    public static String removeCharacter(String sentence, char ch){
        if (sentence == null) return null;
        return sentence.replaceAll("(?i)" + Pattern.quote(String.valueOf(ch)), "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Enter the character to remove: ");
        char ch = scanner.nextLine().charAt(0);

        String result = removeCharacter(input, ch);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

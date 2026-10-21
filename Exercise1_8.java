import java.util.Scanner;

public class Exercise1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean areEqual = str1.equals(str2);
        System.out.println("The two given strings are equal: " + areEqual);

        if (str1.length() > 0 && str2.length() > 0) {
            char first1 = str1.charAt(0);
            char first2 = str2.charAt(0);
            boolean firstCharsEqual = (first1 == first2);

            System.out.println("First character of string 1: '" + first1 + "'");
            System.out.println("First character of string 2: '" + first2 + "'");
            System.out.println("The first characters are equal: " + firstCharsEqual);
        } else {
            System.out.println("Cannot compare first characters: one or both strings are empty.");
        }

        scanner.close();
    }
}
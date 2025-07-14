import java.util.Scanner;

public class TexttoUppercase {

    public static String convertToUpperUsingCharAt(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); 
            }

            result.append(ch);
        }

        return result.toString();
    }


    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        String customUpper = convertToUpperUsingCharAt(input);
        String builtInUpper = input.toUpperCase();

        boolean areEqual = compareUsingCharAt(customUpper, builtInUpper);

   
        System.out.println("\nCustom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both equal? " + (areEqual ? "Yes " : "No "));

        scanner.close();
    }
}

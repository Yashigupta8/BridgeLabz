import java.util.Scanner;

public class TrimUsingCharAt {
    public static int[] getTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String createSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
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


        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();


        int[] indices = getTrimIndices(input);
        int start = indices[0];
        int end = indices[1];

    
        String trimmedCustom = createSubstring(input, start, end);


        String trimmedBuiltIn = input.trim();

        boolean areEqual = compareUsingCharAt(trimmedCustom, trimmedBuiltIn);
        System.out.println("\nCustom Trimmed: \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trimmed: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both equal? " + (areEqual ? "Yes " : "No "));

        scanner.close();
    }
}

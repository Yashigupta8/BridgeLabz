import java.util.Scanner;

public class DigitArrayMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        int temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        int largest = -1;
        int secondLargest = -1;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        
        System.out.println("\nLargest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class ArrayInputSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int count = 0;
        int sum = 0;

        System.out.println("Enter up to 10 positive numbers (enter 0 or a negative number to stop):");

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            int input = scanner.nextInt();

            if (input <= 0) {
                break;
            }

            numbers[count] = input;
            sum += input;
            count++;
        }

        
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        
        System.out.println("\n\nSum of numbers: " + sum);

        scanner.close();
    }
}

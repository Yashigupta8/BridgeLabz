import java.util.Scanner;
public class Table6to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (6 to 9): ");
        int number = scanner.nextInt();

        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
            return;
        }

        System.out.println("Multiplication Table for " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
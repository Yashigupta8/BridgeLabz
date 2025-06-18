import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle (in meters): ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double perimeter = a + b + c;
        double rounds= perimeter/5.0;
        int finalRounds = (int) Math.floor(rounds);
        System.out.println("Rounds needed: " + finalRounds);
    }
}
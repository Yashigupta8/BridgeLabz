import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal, Rate, Time: ");
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double si = calculateInterest(p, r, t);
        System.out.print("The Simple Interest is " + si + " for Principal " + p + ", Rate " + r + " and Time " + t + "\n");
    }

    static double calculateInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}

import java.util.Scanner;

public class TrignoFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] result = trigFunctions(angle);
        System.out.print("Sine: " + result[0] + ", Cosine: " + result[1] + ", Tangent: " + result[2] + "\n");
    }

    static double[] trigFunctions(double deg) {
        double rad = Math.toRadians(deg);
        return new double[]{Math.sin(rad), Math.cos(rad), Math.tan(rad)};
    }
}

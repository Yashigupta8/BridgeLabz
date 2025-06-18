import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (°C) and wind speed (km/h): ");
        double temp = sc.nextDouble(), wind = sc.nextDouble();
        System.out.println("Wind Chill: " + windChill(temp, wind));
    }

    static double windChill(double t, double v) {
        return 13.12 + 0.6215 * t - 11.37 * Math.pow(v, 0.16) + 0.3965 * t * Math.pow(v, 0.16);
    }
}

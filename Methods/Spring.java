import java.util.Scanner;

public class Spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        int month = sc.nextInt(), day = sc.nextInt();
        if (isSpring(month, day)) 
        System.out.println("It's a Spring Season");
        else
         System.out.println("Not a Spring Season");
    }

    static boolean isSpring(int m, int d) {
        return (m == 3 && d >= 20) || (m == 6 && d <= 20) || (m > 3 && m < 6);
    }
}

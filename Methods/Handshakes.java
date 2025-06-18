import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.println("Max handshakes: " + handshakeCount(n));
    }

    static int handshakeCount(int n) {
        return (n * (n - 1)) / 2;
    }
}

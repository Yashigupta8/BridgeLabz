import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates and children: ");
        int choco = sc.nextInt(), kids = sc.nextInt();
        int[] result = divideChocolates(choco, kids);
        System.out.println("Each child gets: " + result[0] + ", Remaining: " + result[1]);
    }

    static int[] divideChocolates(int total, int children) {
        return new int[]{total / children, total % children};
    }
}

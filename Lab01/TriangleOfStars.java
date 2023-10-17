package Lab01;
import java.util.Scanner;
public class TriangleOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of the triangle: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

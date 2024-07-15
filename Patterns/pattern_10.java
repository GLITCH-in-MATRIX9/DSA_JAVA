import java.util.Scanner;

public class pattern_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the diamond (odd number): ");
        int n = scanner.nextInt();
        int h = n / 2;

        for (int i = 0; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= (2 * i) - 1 && j > 0; j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = h - 1; i >= 0; i--) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");
            for (int j = 1; j <= (2 * i) - 1 && j > 0; j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}


import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the diamond (odd number): ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for a circle with an odd number of stars.");
            return;
        }

        reverseDiamond(n);
    }

    static void reverseDiamond(int n) {
        int h = n / 2; // this means spaces are initially an int value half of an odd number
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= h + 1 - i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <= (2 * i) + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= h + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=h;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(h-i)+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i+2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

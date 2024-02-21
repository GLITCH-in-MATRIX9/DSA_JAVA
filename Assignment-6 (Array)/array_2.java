import java.util.Scanner;

public class array_2 {
    public static int gcd(int A, int B) {
        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number");
        int a = sc.nextInt();
        System.out.println("enter your second number");
        int b = sc.nextInt();
        int ans = gcd(a, b);
        System.out.println("The greater common divisor is " + ans);

    }

}

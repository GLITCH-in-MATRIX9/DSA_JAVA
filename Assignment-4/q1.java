
// find factorial of a number using a while loop
//using BigInt
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number dedo");
        double num = sc.nextInt();
        double factorial = 1;
        int i = 2;
        while (i <= num) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("The factorial of " + num + " is " + factorial);
        sc.close();

    }

}
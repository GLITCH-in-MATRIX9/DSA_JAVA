
// sum of all even numbers from 1 to 100 using for and continue
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum+=i;
        }System.out.println("the sum is "+sum);
    }
}   
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SteppingNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();

        // Populate the list
        while (n > 0) {
            int digit = n % 10;
            a.add(0, digit); // Add the digit to the beginning of the list
            n /= 10;
        }

        System.out.println("Stepping numbers:");

        // Check for stepping numbers
        for (int i = 0; i < a.size() - 1; i++) {
            int diff = Math.abs(a.get(i + 1) - a.get(i));
            if (diff == 1) {
                System.out.println(a.get(i) + "" + a.get(i + 1));
            }
        }
    }
}

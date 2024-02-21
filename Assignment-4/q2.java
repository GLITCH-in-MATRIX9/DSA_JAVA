//enter a value of age using do-while

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            System.out.print("Please enter your age (between 0 and 120): ");
            age = scanner.nextInt();

            if (age < 0 || age > 120) {
                System.out.println("Invalid age! Age must be between 0 and 120.");
            }
        } while (age < 0 || age > 120);

        System.out.println("Your age is: " + age);
        scanner.close();
    }
}
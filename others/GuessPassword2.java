import java.util.Scanner;

public class GuessPassword2 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Create a password and store it in a variable.
        String password = "123456";

        // Start guessing the password.
        while (true) {
            // Get the user's guess.
            System.out.println("Enter your guess: ");
            String guess = scanner.next();

            // Check if the guess is correct.
            if (guess.equals(password)) {
                // The guess is correct.
                System.out.println("Congratulations! You guessed the password correctly.");
                break;
            } else {
                // The guess is incorrect.
                System.out.println("Incorrect password. Try again.");
            }
        }

        // Close the Scanner object.
        scanner.close();
    }
}
    


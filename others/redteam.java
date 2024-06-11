
import java.util.Scanner;

// Password guessing game with infinite attempts
public class redteam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password:"); // Asks for input of a password
        String pass = sc.nextLine();
        int count = 0, attempt = 15; // Initializing variables and setting maximum number of guesses
        while (!pass.equals("RedTeam") && attempt > count) {
            if (!"red".equals(pass)) { // Checking whether user entered correct or not
                ++count;
                System.out.print("\nIncorrect Password! You have " + (attempt - count) + " more attempts left.\n");
                System.out.println("Enter the password:");
                pass = sc.nextLine(); // Asking for input again
            } else {
                break;
            }
        }
        if ("RedTeam".equals(pass)) {
            System.out.println("Congratulations!! You won.");
        } else {
            System.out.println("Sorry!!! The right answer is 'RedTeam'. Better luck next time!");
        }
    }
}

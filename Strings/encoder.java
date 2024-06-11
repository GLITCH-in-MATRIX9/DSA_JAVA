import java.util.Scanner;

public class encoder {
    public static String encode(String text, int shift) {
        StringBuilder encodedText = new StringBuilder(); // Use StringBuilder for efficiency

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isLowerCase(letter)) { // Check if the character is lowercase
                letter = (char) (letter + shift);
                if (letter > 'z') {
                    letter = (char) (letter - 26);
                } else if (letter < 'a') {
                    letter = (char) (letter + 26);
                }
            } else if (Character.isUpperCase(letter)) { // Check if the character is uppercase
                letter = (char) (letter + shift);
                if (letter > 'Z') {
                    letter = (char) (letter - 26);
                } else if (letter < 'A') {
                    letter = (char) (letter + 26);
                }
            }
            encodedText.append(letter); // Append the encoded character to StringBuilder
        }
        return encodedText.toString(); // Return the encoded text after the loop
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the encoder of your message");
        while (true) {
            System.out.println("Enter your desired text");
            String string = sc.nextLine();
            System.out.println("Enter the number you want to shift your alphabets by");
            int shift = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by nextInt()
            String en = encode(string, shift);
            System.out.println("Your encoded text is\n" + en);
            System.out.println("Do you want to encode more? (yes/no)");
            String s = sc.nextLine();
            if (!s.equals("yes")) { //if it's not equal to yes then break otherwise keep playing the same code
                break;
            }
        }
        System.out.println("Thank you for using the encoder!");

    }

}

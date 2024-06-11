package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets2 {
    public static boolean isValid(Stack<Character> st, char corresponding_char) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != corresponding_char) {
            return false;
        } else {
            st.pop();
            return true;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string containing only parentheses, curly brackets, and square brackets: ");
        String input = scanner.nextLine();

        boolean data=isValid(st, ch)

        if (isValid) {
            System.out.println("The input string is valid.");
        } else {
            System.out.println("The input string is not valid.");
        }

        scanner.close();
    }

    

}

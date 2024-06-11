package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your elements of stack ");
        String str = sc.nextLine();
        Stack<Character> mystack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                mystack.push(ch);

            } else if (ch == ')') {
                boolean val = handleclosing(mystack, '(');
                if (val == false) {
                    System.out.println(val);
                    return;

                }

            } else if (ch == '}') {
                boolean val = handleclosing(mystack, '{');

                if (val == false) {
                    System.out.println(val);
                    return;

                }

            } else if (ch == ']') {
                boolean val = handleclosing(mystack, '[');

                if (val == false) {
                    System.out.println(val);
                    return;

                }

            }

        }
    }

    public static boolean handleclosing(Stack<Character> st, char corresponding_char) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != corresponding_char) {
            return false;
        } else {
            st.pop();
            return true;
        }

    }

}

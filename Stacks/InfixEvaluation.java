import java.util.Stack;

public class InfixEvaluation {

    public static int operation(int v1, int v2, char optor) {
        if (optor == '+') {
            return v1 + v2;
        } else if (optor == '-') {
            return v1 - v2;
        } else if (optor == '*') {
            return v1 * v2;
        } else { // Assuming optor is '/'
            return v1 / v2;
        }
    }

    public static int precedence(char optor) {
        if (optor == '+' || optor == '-') {
            return 1;
        } else if (optor == '*' || optor == '/') {
            return 2;
        } else {
            return -1; // Assuming default precedence for other characters (not operators)
        }
    }

    public static void main(String[] args) {
        String exp = "3+(2*2)-(1+2)";
        Stack<Integer> operands = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isDigit(ch)) {
                int num = ch - '0';
                operands.push(num);
            } else if (ch == ')') {
                while (!optors.isEmpty() && optors.peek() != '(') {
                    char optor = optors.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int opv = operation(v1, v2, optor);
                    operands.push(opv);
                }
                optors.pop(); // Remove '(' from stack
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!optors.isEmpty() && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())) {
                    char optor = optors.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int opv = operation(v1, v2, optor);
                    operands.push(opv);
                }
                optors.push(ch);
            }
        }

    
    }
}

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter your marks to know your grade\n");
            int n = sc.nextInt();
            if (n >= 0 && n <= 59) {
                System.out.println("YOUR GRADE IS E");
            } else if (n >= 60 && n <= 69) {
                System.out.println("YOUR GRADE IS D");
            } else if (n >= 70 && n <= 79) {
                System.out.println("YOUR GRADE IS C");
            } else if (n >= 80 && n <= 89) {
                System.out.println("YOUR GRADE IS B");
            } else if (n >= 90 && n <= 100) {
                System.out.println("YOUR GRADE IS A");
            } else {
                System.out.println("Invalid Input. Marks must be between 0-100");
            }

            System.out.println("type 1 to view more marks and 2 to exit");
            int m = sc.nextInt();
            if (m == 2) {
                System.out.println("THANK YOU FOR CHOOSING US");
                break;
            }

        }
        sc.close();

    }

}
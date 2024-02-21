import java.util.Scanner;

class array_1 {
    static int evenlyDivides(int N) {
        int sum = 0;
        int b = N;
        while (N!= 0) {
            int digit=0;
            digit = N %10;
            N /= 10;
            if (digit == 0) {
                continue;
            }
            if (b % digit == 0) {
                sum++;

            }
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        int total = evenlyDivides(num);
        System.out.println("The total numbers that divide your num are " + total);

    }
}
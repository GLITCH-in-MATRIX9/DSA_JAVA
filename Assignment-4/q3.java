// sum of digits of a number using a do-while loop

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum=0;
        do{
            int digit=n%10;
            sum+=digit;
            n/=10;

            
        }while(n!=0);
            System.out.println("sum of digits "+sum);
            sc.close();

    }
}

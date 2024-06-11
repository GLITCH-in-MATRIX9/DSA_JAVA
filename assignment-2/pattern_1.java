// *
// **
// ***
// ****
// *****
import java.util.Scanner;

public class pattern_1{
    public static void main(String[]args){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");// the only print statement will print these stars in the same line
            
            }
            System.out.println();//this will turn to next line on completing one loop
        }
    }
}


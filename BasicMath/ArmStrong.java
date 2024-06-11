package BasicMath;
import java.util.Scanner;

public class ArmStrong {

    public static boolean armstrong(int x){
        int armstr=0;
        int original=x;

        while(x!=0){
            int digit=x%10;
            armstr+=digit*digit*digit;
            x/=10;
            
        }
        return armstr==original;

       
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check if armstrong");
        int num=sc.nextInt();
        boolean isArmstrong = armstrong(num);
        
        if (isArmstrong) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        

        sc.close();   
    }
    
}


//   (/) gives quotient
//   (%) gives remainder
// println--prints in the new line everytime
// print--prints along the same line
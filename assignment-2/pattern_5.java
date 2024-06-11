//   *  
//  *** 
// *****
//  *** 
//   *  

import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the diamond (odd number): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for a diamond with an odd number of stars.");
            return;
        }

        printOddDiamond(n);
    }

    static void printOddDiamond(int n){
        int spaces=n/2; //this means spaces are initially an int value half of an odd number
        int stars=1;
        for (int i=0;i<n;i++){
            for(int j=0;j<spaces;j++){
                System.out.print(" ");//printing empty space
            }
            for(int k=0;k<stars;k++){
                System.out.print("*");//printing star
            }
            System.out.println();
            if(i<n/2){
                spaces-=1;
                stars+=2;
            }else{
                spaces+=1;
                stars-=2;
            }
        }
    }
}


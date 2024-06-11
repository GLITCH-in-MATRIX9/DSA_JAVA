//  *****
//   ****
//    ***
//     **
//      *


import java.util.Scanner;
public class pattern_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();//taking user input 
        for(int i=1;i<=n;i++){ //taking the user rows 
            for(int j=0;j<i;j++){//run space loop for values starting from 1 upto i
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){//for all values where the value of j is equal to i and then less than n , print a star.
                System.out.print("*");


            }
           
            System.out.println();
        }

    }
}
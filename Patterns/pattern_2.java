// *****
// **** 
// ***  
// **   
// *  


import java.util.Scanner;
public class pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();//taking user input for number of rows 
        for(int i=n;i>=1;i--){ //these rows start from the opposite way, and go down to 1 
            for(int j=1;j<=i;j++){ //these shows the stars printed in each column
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

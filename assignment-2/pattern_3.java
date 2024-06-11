//     *
//    **
//   ***
//  ****
// *****


import java.util.Scanner;
public class pattern_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();//taking user input for number of rows 
        int spaces=n-1;
        int stars=1;
        for(int i=1;i<=n;i++){ //these rows start from 1 and go to n
            for(int j=1;j<=spaces;j++){ //they print starting from last column then increase
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");


            }
            spaces--;
            stars++;
            System.out.println();
        }

    }
}


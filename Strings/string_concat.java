import java.math.BigInteger;
import java.util.Scanner;


public class string_concat {
    public static String stringConcatenation(String num1, String num2) {
        BigInteger big1=new BigInteger(num1);
        BigInteger big2=new BigInteger(num2);
        BigInteger sum = big1.add(big2);

        return sum.toString();
		
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In this code we add numbers which are inputted as strings");
        System.out.println("enter number of test cases");
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<num;i++){
            String[] input=sc.nextLine().split(" ");
            String num1=input[0];
            String num2=input[1];

            System.out.println(stringConcatenation(num1, num2));
        }
        sc.close();
    }
    
}

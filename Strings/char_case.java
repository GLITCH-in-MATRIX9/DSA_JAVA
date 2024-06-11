// Write a program that takes a character as input and prints either 1, 0, or -1 according to the following rules.

// 1, if the character is an uppercase alphabet (A - Z)
// 0, if the character is a lowercase alphabet (a - z)
// -1, if the character is not an alphabet

import java.util.Scanner;

public class char_case {
    public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        
        // Input a single character
        System.out.println("enter char");
        char ch = sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("1");
        }
		else if(ch>='a' && ch<='z'){
            System.out.println("0");

        } else {
            System.out.println("-1");
        }
        sc.close();
	}

    
}

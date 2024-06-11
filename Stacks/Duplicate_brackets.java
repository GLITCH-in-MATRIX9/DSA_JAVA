package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Duplicate_brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your elements of stack ");
        String str= sc.nextLine();
        Stack<Character> mystack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == ')'){
                if(mystack.peek()=='('){
                    System.out.println("true");
                    return;
                }else{
                    while (mystack.peek()!='(') {
                        mystack.pop();
                        
                    }
                    
                }

            }else{
                mystack.push(ch);
            }
        }
        System.out.println("false");


    }
    
}

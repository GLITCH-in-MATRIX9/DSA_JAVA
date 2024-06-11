package Stacks;

import java.util.Stack;

public class Introductory {
    public static void main(String[] args) {
        Stack<Integer> my_stack = new Stack<>();
        my_stack.push(2);
        my_stack.push(3);
        my_stack.push(4);
        my_stack.push(5);
        my_stack.push(6);
        System.out.println(my_stack);
        my_stack.pop();
        System.out.println("after pop "+my_stack);
       
        System.out.println( "Topmost element is "+my_stack.peek());

    }

}

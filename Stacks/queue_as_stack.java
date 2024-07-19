package Stacks;

import java.util.Stack;

class queue_as_stack {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();


    /** Push element x to the back of queue. */
    public void push(int x) {
        System.out.println("The element pushed is " + x);
        input.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // Shift input to output
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.pop();
    }

    /** Get the front element. */
    public int peek() {
        // Shift input to output
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    /** Returns the size of the queue. */
    public int size() {
        return input.size() + output.size();
    }
}

class TUF {
    public static void main(String[] args) {
        queue_as_stack q = new queue_as_stack();
        q.push(3);
        q.push(4);
        System.out.println("The element popped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}

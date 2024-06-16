
class mystack {
    int arr[];
    int cap;
    int top;

    mystack(int c) {
        top = -1; // start top with -1 indexing
        cap = c;
        arr = new int[cap];
    }

    void push(int x) {
        if (top == cap - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++; // since top started with -1 we need to bring it to the first index
        arr[top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int res = arr[top];
        top--;
        return res;
    }
}

public class Stacks_as_arrays {

    public static void main(String[] args) {
        mystack s = new mystack(5);
        s.push(3);
        s.push(9);
        System.out.println(s.pop()); // Output: 9

        // Additional test cases
        s.push(12);
        s.push(5);
        s.push(6);
        s.push(14);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}

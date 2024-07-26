package LinkedLists;
import java.util.Arrays;
import java.util.List;


class Node{
    public int data;
    public Node next;

    public Node(int data1,Node next1){
        data=data1;
        next=next1;
    }

    public Node(int data1){
        data=data1;
        next=null;

    }

}


public class array_to_ll {

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node insertHead(Node head, int val){
        Node temp=new Node(val,head);
        return temp;
    }

    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(12,5,6,7);
        int value=20; //this is the value to be inserted as the new head

        //creating a ll from initial elements in the array
        Node head=new Node(arr.get(0));
        head.next=new Node(arr.get(1));
        head.next.next=new Node(arr.get(2));
        head.next.next.next=new Node(arr.get(3));

        head=insertHead(head,value);

        printLL(head);

    }
    
}

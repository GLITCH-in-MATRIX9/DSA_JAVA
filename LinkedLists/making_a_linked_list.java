package LinkedLists;

class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;


    }

    Node(int data1)
    {
        this.data=data1;
        this.next=null;
    }
}

public class making_a_linked_list {

    
    public static void main(String[] args) {
        int[] arr={1,2,3,4};

        Node head= new Node(arr[0]);
        Node current=head;

        for(int i=1;i<arr.length;i++){
            current.next=new Node(arr[i]);
            current =current.next;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    
    }
}

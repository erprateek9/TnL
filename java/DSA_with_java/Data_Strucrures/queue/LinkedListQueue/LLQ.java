package DSA_with_java.Data_Strucrures.queue.LinkedListQueue;

public class LLQ {
    Node head=null;
    Node tail=null;
    LLQ(){
       head=null;
       tail=null;
    }

    void enqueue(int data){
        Node new_Node= new Node(data);
        if (head==null){
            head=new_Node;
        }
        else{
            tail=head;
            while (tail.next!=null){
                tail=tail.next;
            }
            tail.next=new_Node;
        }

    }
    void peek(){
        if(head==null){System.out.println("EMPITY QUEUE.");}
        else{
            this.tail=head;
            do{
                System.out.print(" "+ tail.data);
                tail=tail.next;
            }while(tail!=null);
            System.out.println("\n");
        }
        

    }
    int dequeue(){
        int item = head.data;
        head=head.next;
        return item;
    }
}
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

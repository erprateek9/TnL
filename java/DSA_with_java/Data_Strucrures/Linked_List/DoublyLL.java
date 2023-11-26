package dsa_with_java.data_strucrures.linked_list;


public class DoublyLL {
    Node head=null;
    Node tail=null;

    void iaf(int val){
        Node newNode= new Node(val);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    void iar(int val){
        Node newNode= new Node(val);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        

    }
    int daf(){
        int item=head.data;
        head=head.next;
        head.prev=null;
        if (head==null)tail=null;
        return item;
    }
    int dar(){
        int item=tail.data;
        tail=tail.prev;
        if (tail==null)head=null;
        return item;
    }
    void tf(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.println("\n");
    }
    void tb(){
        Node temp=tail;
        while (temp!=null) {
            System.out.print(" "+temp.data);
            temp=temp.prev;
        }
        System.out.println("\n");
    }

}
class Node{
    int data;
    Node prev;
    Node next;
    Node(int d){
        data=d;
        prev=null;
        next=null;
    }
}

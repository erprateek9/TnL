package DSA_with_java.W2;

class LinkedListV1{
    // data members
    Node head;
   
    
    
    class Node{
        int data;
        Node next;
        // const.
        Node(int dta){
            data=dta;
            next=null;
        }
    }
    Node last=null;
    
    void insert(int data){
        Node node= new Node (data);
        if (head==null){
            head=node;
            // System.out.println(node+"$$$"+head.next);
        }
        else{
            // initialization of last
            last=head;
            while(last.next!=null){
                last=last.next;
                // System.out.println(last.data);
            }
            last.next=node;
        }

        
    }
    //printer
    void printer(){
        last=head;
        while(last!=null){
                
            System.out.println(last.data);
            last=last.next;
            
            }
            

        
    }
    Node beforeLast;
    void delLast(){
        last=head;
        while(last!=null){
            if (last.next!=null)
            beforeLast=last;
            last=last.next;
        }
        beforeLast.next=null;

    }
    void insertAt(int data, int position){
        
        Node temp;
        last=head;

        
        for(int x=1;x<position-1;x++){
            
            last=last.next;
        }
        Node node = new Node(data);
        temp=last;
        last.next=node;
        node=temp.next;
        // System.out.println("at position "+last.data);
    }

}

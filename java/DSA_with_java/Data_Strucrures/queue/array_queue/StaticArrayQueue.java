package dsa_with_java.data_strucrures.queue.array_queue;

public class StaticArrayQueue {

    int queue[];
    int front=-1,rear=-1;

    StaticArrayQueue(int l){
        queue= new int[l];
    }
    void enqueue(int data){
        if (rear>=queue.length-1){System.out.println("Queue is full, operation FAILED\n");}
        else {
            if (front<0) front++;
            rear++;
            queue[rear]=data;
        }
    }

    int dequeue(){
        int item=queue[0];
        for (int i=0;i<rear;i++){
            queue[i]=queue[i+1];
        }
        rear--;
        
        return item;
    }
    void peek(){
        if (rear<0){System.err.println("Queue is empity!!!\n");}
        else {
            for (int i =0; i<=rear;i++){
                System.out.print(" "+ queue[i]);
            }
            System.out.println("\n");
        }

    }
}
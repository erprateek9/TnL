package dsa_with_java.data_strucrures.queue.array_queue;

public class DynamicArrayQueue {
    int queue[];
    int front=-1,rear=-1;

    DynamicArrayQueue(int l){
        queue= new int[l];
    }
    void enqueue(int data){
        if (rear>=queue.length-1){
            int temp[]= new int[queue.length+5];
            for (int i=0;i<queue.length;i++){
                temp[i]=queue[i];
            }
            queue=temp;
            if (front<0) front++;
            rear++;
            queue[rear]=data;
            System.out.println("Queue size increased");
        }
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

    }
}

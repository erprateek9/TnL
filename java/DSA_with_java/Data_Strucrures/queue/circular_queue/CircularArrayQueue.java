package dsa_with_java.data_strucrures.queue.circular_queue;

public class CircularArrayQueue {
    int queue[];
    int front=-1,rear=-1;
    CircularArrayQueue(int l){
        queue=new int[l];
    }
    void enqueue(int val){
        int nextRear=(rear+1)%queue.length;
        if (front<0){
            front++;
            rear++;
            queue[rear]=val;
        }
        
        else if (nextRear==front){
            System.out.println("Queue is full");
        }
        else{
            rear=nextRear;
            queue[rear]=val;
        }
    }
    int dequeue(){
        int item=queue[front];
        front=(front+1)%queue.length;

        return item;
    }
    void traverce(){
        int f=front;
        if (f<0){
            System.out.println("Queue is EMPITY");
        }
        
        else {
            while(true){
                System.out.print(" "+queue[f]);
                if (f==rear) break;
                f=(f+1)%queue.length;
            }
            System.out.print("\n");
        }
            
        
    }

}

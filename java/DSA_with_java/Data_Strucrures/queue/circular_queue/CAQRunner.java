package dsa_with_java.data_strucrures.queue.circular_queue;
import java.util.Scanner;

public class CAQRunner {
    public static void main(String[] args) {
        System.out.println("Enter initial size");
        Scanner c1= new Scanner(System.in);
        int initialSize= c1.nextInt();

        CircularArrayQueue cq= new CircularArrayQueue(initialSize);
        System.out.println("Circular queue created ...");
        boolean m1=true;
        while (m1) {
            System.out.println("Press 1 to enqueue\n"+"Press 2 to dequeue\n"+"Press 3 to traverce\n"+"Press any other key to exit");
            int choice= c1.nextInt();  
            switch (choice) {
                case 1:
                    //enqueue
                    System.out.print("Enter value- ");
                    int val= c1.nextInt();
                    cq.enqueue(val);
                    break;
                case 2:
                    //dq
                    int dequeued;
                    if (cq.front<0||cq.front==cq.rear){System.out.println("Queue is EMPITY");}
                    else{dequeued=cq.dequeue();System.out.println("Dequeued "+dequeued);}
                    break;
                case 3:
                    //traverce
                    cq.traverce();
                    break;
                default:
                    m1=false;
                    break;
            }
            
        }
        

    }
}

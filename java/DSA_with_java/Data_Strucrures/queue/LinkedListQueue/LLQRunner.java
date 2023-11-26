package dsa_with_java.data_strucrures.queue.LinkedListQueue;

import java.util.Scanner;

public class LLQRunner {
    public static void main(String[] args) {
        LLQ LLQueue= new LLQ();
       //manu
        Boolean m1=true;
        while (m1){
            System.out.println("Press 1 to enqueue\n"+"Press 2 to dequeue\n"+"Press 3 to peek\n"+"Press any other key to Exit");
            Scanner c1= new Scanner(System.in);
            int choice1= c1.nextInt();
            //Enqueuq
            if(choice1==1){
                System.out.print("Enter value- ");
                int val= c1.nextInt();
                LLQueue.enqueue(val);


            }
            // Dequeue
            else if (choice1==2) {
                if (LLQueue.head==null){System.out.println("Queue is EMPITY");}
                else{
                    int retrivedElement= LLQueue.dequeue();
                    System.out.println("Deququed "+ retrivedElement);
                }
                
            }
            // peek
            else if (choice1==3){
                LLQueue.peek();
            }
            //exit
            else {m1=false;System.err.println("QUITTING ...");}
        }
    }
}

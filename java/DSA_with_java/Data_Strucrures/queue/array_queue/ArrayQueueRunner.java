package DSA_with_java.Data_Strucrures.queue.array_queue;
import java.util.Scanner;
public class ArrayQueueRunner {
    public static void main(String[] args) {
        // Main Menu
        Boolean m1=true;
        while (m1) {
            System.out.println("Main Menu\n"+"Press 1 for Static Array Queue\n"+"Press 2 for Dynamic Array Queue\n"+"Press any other key to exit");
            Scanner c1= new Scanner(System.in);
            int choice1= c1.nextInt();

            

            //make the data structure
            if (choice1==1) {
                // get initial size
                System.out.println("Enter initial size");
                int initialSize= c1.nextInt();

                StaticArrayQueue sq= new StaticArrayQueue(initialSize);
                System.out.println("Static array queue created ...");

                //menu 2-1
                Boolean m2_1=true;
                while (m2_1) {
                    System.out.println("Press 1 to enqueue\n"+"Press 2 to dequeue\n"+"Press 3 to peek\n"+"Press any other key to go back");
                    int choice2_1 = c1.nextInt();
                    if (choice2_1==1) {
                        System.out.print("Enter value- ");
                        int val= c1.nextInt();
                        sq.enqueue(val);
                        
                    }
                    else if (choice2_1==2) {
                        if (sq.rear<0){System.out.println("Queue is empity!!!\n");}
                        else {
                            int retrivedElement = sq.dequeue();
                            System.out.println("Deququed "+ retrivedElement);
                        }
                        
                    }
                    else if (choice2_1==3) {
                        sq.peek();
                    }
                    else {m2_1=false;}
                }
            }
            else if (choice1==2) {
                // get initial size
                System.err.println("Enter initial size");
                int initialSize= c1.nextInt();

                DynamicArrayQueue dq = new DynamicArrayQueue(initialSize);
                System.err.println("Dynamic array queue created ...");

                //menu 2-2
                Boolean m2_2=true;
                while (m2_2) {
                    System.out.println("Press 1 to enqueue\n"+"Press 2 to dqueue\n"+"Press 3 to peek\n"+"Press any other key to go back");
                    int choice2_2 = c1.nextInt();
                    if (choice2_2==1) {
                        System.out.print("Enter value- ");
                        int val= c1.nextInt();
                        dq.enqueue(val);
                    }
                    else if (choice2_2==2) {
                        if (dq.rear<0){System.out.println("Queue is empity!!!\n");}
                        else {
                            int retrivedElement = dq.dequeue();
                            System.out.println("Deququed "+ retrivedElement);
                        }
                    }
                    else if (choice2_2==3) {
                        dq.peek();
                    }
                    else {m2_2=false;}
                }
            }
            else{m1=false;System.err.println("QUITTING ...");}
            
        }
    }
}

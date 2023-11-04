package DSA_with_java.Data_Strucrures.Linked_List;

import java.util.Scanner;

public class DLLRunner {
    public static void main(String[] args) {
        DoublyLL dll= new DoublyLL();
        //manu
        Boolean m1=true;
        while (m1){
            System.out.println("Add at front- 1\n"+"Add at rear- 2\n"+"Delete at front- 3\n"+"Delete at rear- 4\n"+"Traverse Farward- 5\n"+"Traverse Backword- 6\n"+"Exit- Any other key");
            Scanner c1= new Scanner(System.in);
            int choice= c1.nextInt();
            if (choice==1){
                //Add at front
                System.out.print("Enter value- ");
                int val= c1.nextInt();
                dll.iaf(val);
            }
            else if (choice==2){
                //Add at rear
                System.out.print("Enter value- ");
                int val= c1.nextInt();
                dll.iar(val);
            }
            else if (choice==3){
                //Delete at front
                if (dll.head==null){System.out.println("List is EMPITY");}
                else{
                    int element = dll.daf();
                    System.out.println("Deleted "+ element);
                }
            }
            else if (choice==4){
                //Delete at rear
                if (dll.head==null){System.out.println("List is EMPITY");}
                else{
                    int element = dll.dar();
                    System.out.println("Deleted "+ element);
                }
            }
            else if (choice==5){
                //Traverse Farward
                dll.tf();
            }
            else if (choice==6){
                //Traverse Backword
                dll.tb();
            }
            else{m1=false;System.err.println("QUITTING ...");}
        }
    }
}

package dsa_with_java.data_strucrures.tree.BinarySearchTree;

import java.util.Scanner;
import java.util.Random;
public class BSTRunner {
    public static void main(String[] args) {
        BST bst= new BST();
        //menu
        Boolean m1=true;
        while (m1){
            System.out.print("1= insert data\n2= traverse infix\n");
            Scanner c1= new Scanner(System.in);
            int choice= c1.nextInt();
            if (choice==1){
                //Insert
                System.out.print("How many random values - ");
                int nos= c1.nextInt();
                Random rand = new Random();
                for (int i=0;i<nos;i++){
                    int val=rand.nextInt(1000);
                    bst.Insert(val);
                }    
            }
            else if (choice==2){
                // Traverse infix
                BST.TraverseInfix(bst.root);System.out.println("");  
            }
            else {m1=false;}
        }
    }
}

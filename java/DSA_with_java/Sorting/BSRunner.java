package DSA_with_java.Sorting;
import java.util.Scanner;
public class BSRunner {
    public static void main(String[] args) {
        System.out.println("BUBBLE SORT");
        System.out.println("Enter the size of array");
        Scanner l= new Scanner(System.in);
        int len = l.nextInt();
        BubbleSortV1 array= new BubbleSortV1(len);
        array.initializer();
        array.printer();
        // choice for sorting

        System.out.println("for Ascending order,Press 1");
        System.out.println("for Decending order,Press 2");
        Scanner ch= new Scanner(System.in);
        int choice = l.nextInt();
        if (choice==1)array.ascender();
        else if (choice==2) array.decender();
        else  System.out.println("INVALID CHOICE");
        array.printer();
 
    }
}
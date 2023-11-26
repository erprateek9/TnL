package dsa_with_java.algorithms.searching;
import java.util.Scanner;
import java.util.Random;
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner dta= new Scanner(System.in);
        int len= dta.nextInt();
        int data[] = new int[len];
        Random r= new Random();
        for (int i=0;i<data.length;i++){
            data[i]=r.nextInt(1000);
            System.out.print(" "+data[i]);
        }
        System.out.println("");
        System.out.println("Enter the number to be searched");
        int item= dta.nextInt();
        boolean found =false;
        for (int i=0;i<data.length;i++){
            if (item==data[i]){found=true; break;}
        }
        if (found){System.out.println(item +" is found in the list");}
        else System.out.println(item+" is not found");

        
    }
}

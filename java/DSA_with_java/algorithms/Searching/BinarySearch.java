package DSA_with_java.algorithms.Searching;

import java.util.Scanner;

public class BinarySearch {
    static boolean bSearcher(int item,int a[]){
        boolean found= false;
        if (a.length<=0) return false;
        int left=0, right =a.length-1;
        int iterations=0;
        while (left<=right) {
            iterations++;
            if (left==right){
                if (a[left]==item||a[right]==item) {found=true;break;}
                else {found=false;break;}
            }
            int mid= (right+left)/2;
            if (item==a[mid]) {found=true;break;}
            else if (item<a[mid]){ 
                right=mid-1;
            }
            else if (item>a[mid]){ 
                left=mid+1;
            }
            
        }
        System.out.println("Iterations - "+iterations);
        return found;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner dta= new Scanner(System.in);
        int len= dta.nextInt();
        int data[] = new int[len];
        for (int i=0;i<data.length;i++){
            data[i]=i;
            System.out.print(" "+data[i]);
        }
        System.out.println("");
        System.out.println("Enter the number to be searched");
        int item= dta.nextInt();
        boolean found = bSearcher(item, data);


        if (found){System.out.println(item +" is found in the list");}
        else System.out.println(item+" is not found");
    }
}

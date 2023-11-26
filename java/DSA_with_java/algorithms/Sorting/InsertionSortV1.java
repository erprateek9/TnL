package dsa_with_java.algorithms.sorting;

import java.util.Random;

public class InsertionSortV1 {
    int arr[];
    InsertionSortV1(int l){
        arr=new int[l];
    }
    void initializer(){
        
        
        System.out.println("Generating random values...");
        

        Random rand= new Random();
        for (int i =0;i<arr.length;i++){
            arr[i]= rand.nextInt(100);
        }

    }

    void printer(){
      for (int i =0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
      } 
      System.out.println("");
  }
  void ascender(){
    int temp;
    
    for (int i=0;i<arr.length;i++){

        temp=arr[i];
        int j=i-1;
        while ((j>=0) && (arr[j]>temp)) {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;

    }

  }
  void decender(){
    int temp;
    
    for (int i=0;i<arr.length;i++){

        temp=arr[i];
        int j=i-1;
        while ((j>=0) && (arr[j]<temp)) {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;

    }

  }
}

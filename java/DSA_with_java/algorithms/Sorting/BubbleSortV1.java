package DSA_with_java.algorithms.Sorting;

import java.util.Random;

public class BubbleSortV1 {
   int arr[];
   int len;
   
   BubbleSortV1(int l){
   len=l;
   arr= new int[len]; 
   }

   void initializer(){
        
        
        System.out.println("Generating random values...");
        

        Random rand= new Random();
        for (int i =0;i<arr.length;i++){
            arr[i]= rand.nextInt(1000);
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

        for(int i=0;i<len-1;len--){
            for(int j=0;j<len-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
         
        
      }
      len=arr.length;
   }
   void decender(){
      int temp;

        for(int i=0;i<len-1;len--){
            for(int j=0;j<len-1;j++){
                if (arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
         
        
      }
      len=arr.length;
   }
}


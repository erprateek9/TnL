package DSA_with_java.Sorting;
import java.util.Random;
public class SelectionSortV1 {
    int arr[];
    int len;
    SelectionSortV1(int l){
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
        int min,loc,temp;
        
        
        for (int i= 0;i<arr.length-1;i++){
            loc=i;min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                
                if (arr[j]<min){
                    min=arr[j];
                    loc=j;
                }
            }
            temp=arr[i];
            arr[i]=min;
            arr[loc]=temp;

            
        
        }

    }
    void decender(){
        int max,loc,temp;
        
        
        for (int i= 0;i<arr.length-1;i++){
            loc=i;max=arr[i];
            for(int j=i+1;j<arr.length;j++){
                
                if (arr[j]>max){
                    max=arr[j];
                    loc=j;
                }
            }
            temp=arr[i];
            arr[i]=max;
            arr[loc]=temp;

            
        
        }

    }


}

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
        int smallest,temp;
        
        smallest=arr[0];
        for (int i= 0;i<arr.length;i++){
            smallest=i;
            for(int j=i+1;j<arr.length;j++){
                
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

            
        
        }

    }
    void decender(){
        int largest,temp;
        
        largest=arr[0];
        for (int i= 0;i<arr.length;i++){
            largest=i;
            for(int j=i+1;j < arr.length;j++){
                
                if (arr[largest]<arr[j]){
                    largest=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
        }
    }


}

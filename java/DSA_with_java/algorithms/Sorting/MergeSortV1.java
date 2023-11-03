package DSA_with_java.algorithms.Sorting;
import java.util.Random;
public class MergeSortV1 {
    int arr[];
    MergeSortV1(int l){
        arr=new int[l];
    }

    void initializer(){
        System.out.println("Generating random values...");
        Random rand= new Random();
        for (int i =0;i<arr.length;i++){
            arr[i]= rand.nextInt(10);
        }

    }

    void printer(){
      for (int i =0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
      } 
      System.out.println("");
  }
  void splitterA(int a[]){
    int l=a.length;
    if (l>=2){
        int leftSize=l/2;
        int rightSize=l-leftSize;
        int left[]= new int[leftSize];
        int right[]= new int[rightSize];
        for(int i=0;i<leftSize;i++){
            left[i]=a[i];
        }
        for(int i=0;i<rightSize;i++){
            right[i]=a[leftSize+i];
        }
        splitterA(left);
        splitterA(right);
        MergerA(left,right,a);

    }

  }
  void splitterD(int a[]){
    int l=a.length;
    if (l>=2){
        int leftSize=l/2;
        int rightSize=l-leftSize;
        int left[]= new int[leftSize];
        int right[]= new int[rightSize];
        for(int i=0;i<leftSize;i++){
            left[i]=a[i];
        }
        for(int i=0;i<rightSize;i++){
            right[i]=a[leftSize+i];
        }
        splitterD(left);
        splitterD(right);
        MergerD(left,right,a);

    }

  }
  void MergerA(int left[],int right[],int a[]){
    int leftAt=0,rightAt=0,i=0;
    
        while (leftAt<left.length&&rightAt<right.length) {
            if (left[leftAt]<=right[rightAt]){
                a[i]=left[leftAt];
                i++;
                leftAt++;
            }
            else {
                a[i]=right[rightAt];
                i++;
                rightAt++;
            }
        }
        while (leftAt<left.length) {
            a[i]=left[leftAt];
            i++;
            leftAt++;
            
        }
        while (rightAt<right.length) {
            a[i]=right[rightAt];
            i++;
            rightAt++;
        }
            
        

    }
    void MergerD(int left[],int right[],int a[]){
    int leftAt=0,rightAt=0,i=0;
    
        while (leftAt<left.length&&rightAt<right.length) {
            if (left[leftAt]>=right[rightAt]){
                a[i]=left[leftAt];
                i++;
                leftAt++;
            }
            else {
                a[i]=right[rightAt];
                i++;
                rightAt++;
            }
        }
        while (leftAt<left.length) {
            a[i]=left[leftAt];
            i++;
            leftAt++;
            
        }
        while (rightAt<right.length) {
            a[i]=right[rightAt];
            i++;
            rightAt++;
        }
            
        

    }
  
  void ascender(){
    this.splitterA(this.arr);

  }




    void decender(){
        this.splitterD(this.arr);

    }
}

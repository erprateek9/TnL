package DSA_with_java.Data_Strucrures.array;
import java.util.Scanner;


//  int array for now
class ArrayV1{
    
    int [] arr;
    int last =0;
    //constructer
    ArrayV1 (int sze){
        this.arr = new int [sze];
    }

    void initialize(){
        int i;
        for (i=0;i<arr.length;i++,last++){
            System.out.println("enter "+ i + " element");
            Scanner elmnt= new Scanner (System.in);
            arr[i]= elmnt.nextInt();
        }
    }
    void printer(){

        int i;
        for (i=0;i<last;i++){
            System.out.print(arr[i]+ " ");
            
        }
        System.out.println("");
    }
    void remove(){
        if (last==0){
            System.out.println("Array in empity");
        }
        else{
            last--;
        }
    }
    void remove (int position){
        if (position > last| position< 1){
            System.out.println("position is invalid");
        }
        else{
            for(int i=position;i<last;i++){
                arr[i-1]=arr[i];
            }
            last--;

        }
        


    }
    void insert(int elmnt){
        if (last==arr.length){
            System.out.println("Array is full");
        }
        else{
            arr[last]=elmnt;
            last++;
        }
    }
    void insert(int elmnt, int position){
        if (last>=arr.length){
            System.out.println("Array is full");
        }
        else{
            int i;
            int temp=last;
            for(i = temp;i>=position;i--){
            arr[temp]=arr[temp-1]; temp=temp-1;
            }
            arr[i]=elmnt;
            last++;
        }
    }



    // void menu(){
    //     int selection =0;
    //     do {
    //     System.out.println("To initialize, press 1");
    //     System.out.println("To add new element, press 2");
    //     System.out.println("To delete an element, press 3");
    //     System.out.println("To show, press 4");
        
    //     if (selection==1){
    //         System.out.println("You can enter upto "+this.length() );
    //     }

    //     }while (selection==1|selection==2|selection==3|selection==4);


    // }


}
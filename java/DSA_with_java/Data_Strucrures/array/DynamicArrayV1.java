package dsa_with_java.data_strucrures.array;
import java.util.Scanner;

public class DynamicArrayV1 {
    int arr [];   
    int size=0;
    int temp[];
    int temp2[];
    int last;
    int lastOfTemp2;

    DynamicArrayV1(){
        arr = new int[1];
        size=1;
        last=0;

    }
    void menu(){
        int selection =0;
        do {
        
        System.out.println("To add new elements, press 1");
        System.out.println("To delete an element, press 2");
        System.out.println("To print the array, press 3");
        System.out.println("Press any other number to quit");
        Scanner opt= new Scanner(System.in);
        selection= opt.nextInt();


        switch(selection){
            case 1:
                inserter();
                break;
            case 2:
                deleter();
                break;
            case 3:
                printer();
                break;
            default:
                System.out.println("Quitting!!!");
                break;

        }



       

        }while (selection==1|selection==2|selection==3|selection==4);
    }
    void inserter(){
        boolean choice=true;
        int insertSelection=0;
        while (choice) {
            // System.out.println("To insert single element, press 1");
            // System.out.println("To insert multiple elements, press 2");
            System.out.println("How many elements to add");
            System.out.println("Press 0 to go back");
            Scanner opt= new Scanner(System.in);
            insertSelection= opt.nextInt();
            if (insertSelection==0)choice=false;
            else if (insertSelection<0){
                System.out.println("Invalid number of elements");
                choice=false;
            }
            else{

                //initializing temp array;
                temp= new int[insertSelection];
                // make a temp array to store the given data
                System.out.println("Enter the element(s)");
                for(int i =0;i<insertSelection;i++){
                    System.out.println("Enter "+ (i+1)+" element");
                    Scanner elmnt = new Scanner(System.in);
                    int element= elmnt.nextInt();
                    temp[i]=element;
                }
                


                System.out.println("Press 1 to insert at the beginning");
                System.out.println("Press 2 to append");
                System.out.println("Press 3 to insert at any other location");
                opt= new Scanner(System.in);
                insertSelection= opt.nextInt();
                if (insertSelection==1){
                    if((last + temp.length)>arr.length-1){
                        int newLength=(arr.length)*2;
                        while(newLength<=(last + temp.length)){
                            newLength=newLength*2;
                            
                         }
                        //  temp2=new int[arr.length*2];
                        temp2=new int[newLength];
                        for (int i =0; i<temp.length;i++,lastOfTemp2++){
                            temp2[i]=temp[i];

                        }
                         for( int i =0;i < last;i++,lastOfTemp2++){
                            temp2[lastOfTemp2]=arr[i];
                            
                        }
                        
                        // assigning new array to arr
                        arr=temp2;
                        last=lastOfTemp2;
                    
                    }
                     else{
                        for(int i =0;i<temp.length;i++,last++){
                            arr[last]=temp[i];
                        }
                    }
                }  
                   
                
                else if (insertSelection==2){//append
                    if((last + temp.length)>arr.length){
                        int newLength=(arr.length)*2;
                        while(newLength<=(last + temp.length)){
                            newLength=newLength*2;
                            
                         }
                        //  temp2=new int[arr.length*2];

                        temp2=new int[newLength];
                         for( int i =0;i < last;i++,lastOfTemp2++){
                            temp2[i]=arr[i];
                            
                        }

                        for (int i =0; i<temp.length;i++,lastOfTemp2++){
                            temp2[lastOfTemp2]=temp[i];

                        }
                         
                        
                        // assigning new array to arr
                        arr=temp2;
                        last=lastOfTemp2;
                    
                    }
                     else{
                        for(int i =0;i<temp.length;i++,last++){
                            arr[last]=temp[i];
                        }
                    }

                }
                else if (insertSelection==3){// at index
                    System.out.println("Enter the index number");
                    Scanner indxCh= new Scanner(System.in);
                    int indexChoice= indxCh.nextInt();
                    if (indexChoice<0|indexChoice>=last){
                        System.out.println("INVALID INDEX");
                        break;
                    }
                    if((last + temp.length)>arr.length){
                        int newLength=(arr.length)*2;
                        while(newLength<=(last + temp.length)){
                            newLength=newLength*2;
                            
                         }
                        //  temp2=new int[arr.length*2];

                        temp2=new int[newLength];
                         for( int i =0;i < indexChoice;i++,lastOfTemp2++){
                            temp2[i]=arr[i];
                            
                        }

                        for (int i =0; i<temp.length;i++,lastOfTemp2++){
                            temp2[lastOfTemp2]=temp[i];

                        }
                        for( int i=indexChoice ; i < last ; i++,lastOfTemp2++){
                            temp2[lastOfTemp2]=arr[i];
                            
                        }
                         
                        
                        // assigning new array to arr
                        arr=temp2;
                        last=lastOfTemp2;
                    
                    }
                     else{
                        for(int i =0;i<temp.length;i++,last++){
                            arr[last]=temp[i];
                        }
                    }
                    
                }
                else
                    System.out.println("invalid position");
                    
                choice=false;
            }

            
        }
    }

    void deleter(){
        System.out.println("Enter the index of the element to be deleted");
        Scanner indxCh= new Scanner(System.in);
        int indexChoice= indxCh.nextInt();
        if (indexChoice<0|indexChoice>=last){
            System.out.println("INVALID INDEX");
        }
        else{
            for(int i=indexChoice;i<last-1;i++){
                 arr[i]=arr[i+1];
            }
            last-=1;
        }

    }

    void printer(){
        for (int i=0;i<last;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        
    }
}

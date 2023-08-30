package DSA_with_java.array;
import java.util.Scanner;

public class ArrayV1Runner {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner scannerInput = new Scanner(System.in);
        int sizeOfArray=0;
        
        if(scannerInput.hasNextInt()){
            sizeOfArray = scannerInput.nextInt();
        }
        
        ArrayV1 array = new ArrayV1(sizeOfArray);

        // to add the elements
        //menu
        // array.menu();
        array.initialize();
        array.printer();
        array.remove(2);
        array.printer();
        array.insert(6,1);
        array.printer();
        
    }
}

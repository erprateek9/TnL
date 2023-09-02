package DSA_with_java.array;
import java.util.Scanner;
public class DynamicArrayV1Runner {
    public static void main(String[] args) {
        System.out.println("Provide the initial size");
        Scanner sze = new Scanner(System.in);
        int size= sze.nextInt();
        DynamicArrayV1 array = new DynamicArrayV1(size);
        array.menu();
    }
}

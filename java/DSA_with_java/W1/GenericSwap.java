package java.DSA_with_java.W1;
//NOT WORKING

public class GenericSwap {

    
    public static <T> void genericSwap (T x, T y)
    {
        T temp;
        temp = x;
        x=y;
        y=temp;
        // a.GenericSwap=y;
        System.out.println(x+" "+y);
    }

    public static void main(String[] args) {
        Integer a = Integer.valueOf(99);
        Integer b = Integer.parseInt("66");
        genericSwap(a,b);
        System.out.println(a+" "+b);
        System.out.println((a.getClass().getSimpleName()));
    }
}

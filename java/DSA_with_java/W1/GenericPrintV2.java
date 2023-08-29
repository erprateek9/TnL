package java.DSA_with_java.W1;
public class GenericPrintV2 {
    static <T> void genericPrint(T x)
    {
        System.out.println(x);
    }
    public static void main(String[] args) {
        genericPrint(45233432456l);
    }
}

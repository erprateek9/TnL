package java.DSA_with_java.W1;
class GenericPrint
{
    <T>void genericPrint(T x)
    {
        System.out.println(x);
    }
    public static void main(String args[]) {
        GenericPrint anObject= new GenericPrint();
        anObject.genericPrint(23423);
        anObject.genericPrint("HELLO AGAIN");
        
    }
}
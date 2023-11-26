package dsa_with_java.W1;
class Ellipsis{
    public static  void printAnything(Object ... a){
        for (Object x :a){
            System.out.print(" "+x);
        }
    }

    public static void main(String[] args) {
        
        printAnything(897,"tyre");
    }
}
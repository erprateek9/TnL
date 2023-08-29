// can pass any number of argumants
class VarargPrint{
    int values[];

    // VarargPrint(int ... a){
    //     values=a;
    // }
    static void vPrinter(int ...a){
        for (int x:a){
            System.out.println(x);
        }
    }
    //overloaded vPrinter
    static void vPrinter(String ...a){
        for (String x:a){
            System.out.println(x);
        }
    }

}



public class Vararg {
    public static void main(String[] args) {
        // VarargPrint ob1 ={34,43,43,5476,67};
        VarargPrint.vPrinter(34,43,43,35467,67);
        VarargPrint.vPrinter("hi","bro");
    }
}

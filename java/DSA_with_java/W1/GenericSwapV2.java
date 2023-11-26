package dsa_with_java.W1;
class Person
{
    String name;
    double marks;
    Person (String name, double marks)
    {
        this.name=name;this.marks=marks;
    }
}


public class GenericSwapV2 {
    public static <T> void genericSwapV2(T ob1, T ob2){
        T temp;
        temp = ob1;
        ob1=ob2;
        ob2=temp;
        
    }

    public static void main(String[] args) {
        Person o1= new Person("Prateek", 34);
        Person o2= new Person("Soham", 33454);
        genericSwapV2(o1,o2);
        System.out.println(o1.name +" got "+ o1.marks + " marks");
        System.out.println(o2.name +" got "+ o2.marks + " marks");
    }
    
}

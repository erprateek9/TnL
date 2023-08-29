// overriding methods at runtime
class Fig{
    double a,b;
    Fig(double a,double b){
        this.a=a;this.b=b;

    }
    void area(){
        System.out.println("area is"+a*b);
    }
}
class Rect extends Fig{
    Rect(double a,double b){
    super (a,b);
    }
    
    
    void area(){
        System.out.println("inside Rect class"+ a*b);
    }
}
class Treg extends Fig{
    Treg(double a, double b){
        super(a, b);
    }
    void area(){
        System.out.println("inside Treg class"+ ((a*b)/2));
    }
}

public class Overriding {
    public static void main(String[] args) {
        Fig f;
        Rect r = new Rect(10, 10);
        Treg t = new Treg(10,10);
        f=t;
        f.area();
        f=r;
        f.area();
    }
}

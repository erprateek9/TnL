// constructer overload

class BoxHolder{
    int w,h,l;
    BoxHolder(int w, int h, int l){
        this.w=w;this.h=h;this.l=l;
    }
    BoxHolder(int c){
        w=h=l=c;
    }
    BoxHolder(BoxHolder o){
        w=o.w;h=o.h;l=o.l;
    }
    static int vol(BoxHolder v){
        // to check call by reference
        v.h*=11;
        return v.h*v.l*v.w;

    }
}

public class Box {
    public static void main(String[] args) {
        BoxHolder b1= new BoxHolder(10,11,10);
        BoxHolder b2 = new BoxHolder (3);
        BoxHolder b3 = new BoxHolder (b1);
        int vol = BoxHolder.vol(b3);
        System.out.println(vol);
        //also chwcking call by reference
        System.out.println(b3.h);

    }
}

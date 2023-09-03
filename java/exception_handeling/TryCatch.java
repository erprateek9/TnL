package exception_handeling;

import java.util.Random;
class TryCatch{

    public static void main(String[] args) {
        int a,b,c;

        for(int i=0;i<32000;i++){
            Random r= new Random();
            Random s= new Random();
            b= r.nextInt();
            c= s.nextInt();
            try {
                a=(b/c)/12345;
            } catch (ArithmeticException e) {
                a=0;
                // TODO: handle exception
            }
            System.out.println(a+" "+b+" "+c);
        }


    }
}

public class Tester {
    public static void main(String[] args) {
        int num=371,len=0,res=0;
        int numCopy=num;

        while(numCopy!=0){
            numCopy/=10;
            len++;
        }
        numCopy=num;
        while(numCopy!=0){
            int digit=numCopy%10;
            int powerDigit=1;
            int lenCopy=len;
            while(lenCopy>=1)
            {powerDigit*=digit;
                lenCopy--;}
            res+=powerDigit;
            numCopy/=10;
        }

        //System.out.println(num+" ji "+ res);
        // res*=numX;

        if (res==num)System.out.println(num + " is an Armstrong number ");
        else System.out.println(num + " is NOT an Armstrong number ");
    }
}

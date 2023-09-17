public class Test {
    public static void main(String[] args) {
        
        
        int num=15;int lsum=0,len=0;
        int tempNum=num;
        while(tempNum!=0){
            tempNum/=10;
            len++;
        }
        int lc=0;
        int t2 =num;
        while(len>0){
            lc++;
            tempNum=t2;
            for(int i=1;i<len;i++){
                tempNum/=10;
            }
            int a=tempNum*tempNum;
            for(int i=1;i<len;i++){
                tempNum*=10;
            }
            t2=t2-tempNum;

            len--;
            if(lc%2==0)
            lsum+=a;
        }
        if (lsum%9==0){
             System.out.println("The number "+num+" is a lucky number");
        }
       else
       System.out.println("The number "+num+" is NOT a lucky number");

    }
}

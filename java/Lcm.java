public class Lcm {
    public static void main(String[] args) {
        int num1=5,num2=10,lcm=1;
        int temp=0;
        if (num1<0)num1*=(-1);
        if (num2<0)num2*=(-1);
        if (num1<num2){
            temp=num1;num1=num2;num2=temp;
        }
        if(num1==0||num2==0)System.out.println("Undefined");
        else{
            int devisor=1;
            int largest=num1;
            while(devisor<=largest){
                int ds=0;
                if (num2%devisor==0){
                    num2/=devisor;
                    ds++;
                }
                if(num1%devisor==0){
                    num1/=devisor;ds++;
                }
                
                if (ds>0){
                    lcm*=devisor;
                    devisor=2;
                }
                else
                devisor++;
            }
            System.out.println(lcm);
        }
        
    }
}

public class Palindrome {
    public static void main (String args []) { 
        int num=222444222,pal=0;
        int len=0;
        if (num<0)pal=-1;
        else if (num<=9)pal++;
        else
        {
            int tempNum=num;
            while(tempNum!=0){
                tempNum/=10;
                len++;
            }
            int lastDiv=1;
            while(len>0){lastDiv*=10;len--;}
            
            tempNum=num;
            while(tempNum>0){
                lastDiv/=10;
                int fd=tempNum/lastDiv;
                int ld = tempNum%10;
                //System.out.println(fd+"  sdf "+ld);
                if (fd!=ld) {pal--;break;}
                else{
                    tempNum-=(fd*lastDiv);
                    tempNum/=10;
                    
                }
                lastDiv/=10;
                //System.out.println(fd+"  sdf "+ld+" tn "+ tempNum);

            }
            
            for(int i=1,j=len;i<=j;i++,j--){
                int lastDevider=1;int firstDevider=10;
                int jCopy=j;
                while(jCopy!=0){lastDevider*=10;jCopy/=10;}


               // System.out.println(num/lastDevider+"  sdf"+num%firstDevider);
            }

        }
        
        if (pal<=-1)System.out.println(num+" is not a palindrome");
        else System.out.println(num+" is a palindrome");
        
    }
}
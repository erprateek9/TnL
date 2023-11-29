class Tester {
    
   public static int[] findLeapYears(int year){
       //Implement your code here and change the return value accordingly
	   int count=1,int i=0;
	   int leapYrs[]= new int[15];
	   while(count<=15){
			if((year%400==0)||(year%4==0&&year%100!=0)){
				leapYrs[i]=year;
				i++;
				year++;
				count++;
			}
			else {year++;}
	   }
        return leapYrs;
   }
    
   public static void main(String[] args) {
       int year = 2000;
	   int[] leapYears;
	   leapYears=findLeapYears(year);
	   for ( int index = 0; index<leapYears.length; index++ ) {
	       System.out.println(leapYears[index]);
	   }
    }
}

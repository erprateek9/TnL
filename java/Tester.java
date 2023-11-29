class Tester {
    
    public static double[] findDetails(double[] salary) {
		double result[]=new double[3];
		for(double sal:salary){
			result[0]+=sal;
		}result[0]=result[0]/salary.length;
		for(double sal:salary){
			if (sal<result[0]){result[2]+=1;}
			else if (sal>result[0]){result[1]+=1;}
		}
        //Implement your code here and change the return value accordingly
        return result;     

    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}

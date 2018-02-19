package test;

import java.util.Scanner;

public class Employee {
	static char grade;
	static double basic ;
	double bonus;
	
	
	static
	{
		Scanner s= new Scanner(System.in);

        System.out.println("Enter the basic pay of the Employee");
        basic=s.nextDouble();
        
        System.out.println("Enter the grade: M/E");
        grade=s.next().charAt(0);
	}
		 
	 public void cal_bonus()
	    {
	        if((grade=='M')&&(basic>=20000))
	        {
	            System.out.println("Employee bonus is : 10000");
	            bonus=basic+10000;
	            System.out.println("Employee's Salary after bonus is: " +bonus);
	        }
	        else if((grade=='M')&&(basic<20000)) {
	            System.out.println("Employee bonus is : 7000");
	            bonus=basic+7000;
	            System.out.println("Employee's Salary after bonus is: " +bonus);
	       
	        }
	        else if ((grade=='E')&&(basic>=15000))
	        {
	            System.out.println("Employee bonus is : 5000");
	            bonus=basic+5000;
	            System.out.println("Employee's Salary after bonus is: " +bonus);
	        }
	        else if((grade=='E')&&(basic<15000))
	        {
	            System.out.println("Employee bonus is : 3000");
	            bonus=basic+3000;
	            System.out.println("Employee's Salary after bonus is: " +bonus);
	        }
	        else
	            System.out.println("NO BONUS");
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee oo= new Employee();
	       //oo.acc();
	       oo.cal_bonus();
	}

}


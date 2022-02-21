package com.bridgelabz;

public class EmpWageCalcUC6{

	final static int emp_rate_per_hour=20;
	final static int num_working_days=30;

	//Method to Generate Random NUmber
	private static int getRandomNumber(int emp) {
		//Generate random number for 0 for absent 1 for present
		int empCheck=(int)Math.floor(Math.random()*10) % 3;
		//System.out.println(empCheck);
		return empCheck;

	}

	private static void calculateMonthlyWageUsingWhile(int full_time, int parttime) {

		int empCheck=0;
		int empHrs=0;
		int empWage=0;
		int monthlyempWage=0;
		int total_emp_hours=0;
		int total_working_days=0;
		int max_hours_in_month=100;
		while(total_emp_hours <= max_hours_in_month && total_working_days <= num_working_days ) {
			int empHours=0;
			total_working_days++;
			double empCheck1=Math.floor(Math.random()*10) % 3;
			int empcheck=(int)empCheck1;

			switch(empcheck){    
			case  2:    
				empHours=8;
				break;  //optional  
			case 1:    
				empHours=4;
				break; 
			default:     
				empHours=0;  
				break;
			} 
			total_emp_hours+=empHours;
			empWage=emp_rate_per_hour*empHours;
			monthlyempWage=monthlyempWage+empWage;
		}
		System.out.println("Employee Salary is "+empWage);
		System.out.println("Employee Monthly Salary is "+monthlyempWage);
		System.out.println("Employee total Hours is "+total_emp_hours);
	}


	public static void main(String[] args) {
		//declaring constants
		int is_fulltime=1;

		//declaring constants
		final int fulltime=2;
		final int parttime=1;

		//declaring variables
		int empCheck=0;
		getRandomNumber(empCheck);
		//here calculateDailyWage() method can be used as method overloading
		//calculateDailyWage(is_fulltime);
		calculateMonthlyWageUsingWhile(parttime,fulltime);

	}


}


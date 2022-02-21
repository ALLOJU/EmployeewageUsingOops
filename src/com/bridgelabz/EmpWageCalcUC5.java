package com.bridgelabz;

public class EmpWageCalcUC5 {

	final static int emp_rate_per_hour=20;
	final static int num_working_days=20;

	//Method to Generate Random NUmber
	private static int getRandomNumber(int emp) {
		//Generate random number for 0 for absent 1 for present
		int empCheck=(int)Math.floor(Math.random()*10) % 3;
		//System.out.println(empCheck);
		return empCheck;

	}

	private static void calculateMonthlyWageUsingSwitch(int fulltime, int parttime) {

		int empCheck=0;
		int empHrs=0;
		int empWage=0;
		int monthlyempWage=0;
		for(int day=1;day<=30;day++) {
			empCheck=getRandomNumber(empCheck);
			//System.out.println(empCheck);
			switch (empCheck){    
			case 2:    
				empHrs=8;
				break;  //optional  
			case 1:    
				empHrs=4;
				break; 
			default:     
				empHrs=0;  
				break;
			} 
			empWage= emp_rate_per_hour * empHrs;
			monthlyempWage=monthlyempWage+empWage;
		}


		System.out.println("Employee Wage is "+empWage);
		System.out.println("Monthly Employee Wage is "+monthlyempWage);

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
		calculateMonthlyWageUsingSwitch(parttime,fulltime);

	}


}


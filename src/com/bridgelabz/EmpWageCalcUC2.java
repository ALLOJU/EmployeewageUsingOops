package com.bridgelabz;

public class EmpWageCalcUC2 {

	final static int emp_rate_per_hour=20;

    //Method to Generate Random NUmber
	private static int getRandomNumber(int emp) {
		//Generate random number for 0 for absent 1 for present
				int empCheck=(int)Math.floor(Math.random()*10) % 2;
				//System.out.println(empCheck);
				return empCheck;
		
	}
	/*
	 * //Method to check whether employee present or not private static void
	 * checkEmpPresentOrNot(int is_fulltime) { int empCheck=0;
	 * empCheck=getRandomNumber(empCheck);
	 * 
	 * 
	 * //if condition to check employee is present for the input is_fulltime=1
	 * if(empCheck==is_fulltime) { System.out.println("Employee is Present"); }
	 * //else condition to check employee is absent for the input is_fulltime=0 else
	 * System.out.println("Employee is Absent"); }
	 */


	private static void calculateDailyWage(int is_fulltime) {
		//constants
		
		
		//variables
		int empHrs=0;
		int empWage=0;
		int empCheck=0;
		
		empCheck=getRandomNumber(empCheck);
		System.out.println(empCheck);
		if(empCheck==is_fulltime) 
			empHrs=8;
		else
			empHrs=4;
		
		empWage= emp_rate_per_hour * empHrs;
		
		System.out.println("Emp Wage is "+empWage);
		
	}


	public static void main(String[] args) {
		//declaring constants
		int is_fulltime=1;
		int empCheck=0;
		getRandomNumber(empCheck);
		//checkEmpPresentOrNot(is_fulltime);
		calculateDailyWage(is_fulltime);

	}




}


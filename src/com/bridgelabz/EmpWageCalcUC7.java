package com.bridgelabz;

import java.util.Scanner;

public class EmpWageCalcUC7{

	final static int emp_rate_per_hour=20;
	final static int num_working_days=30;

	//Method to Generate Random NUmber
	private static int getRandomNumber(int emp) {
		//Generate random number for 0 for absent 1 for present
		int empCheck=(int)Math.floor(Math.random()*10) % 3;
		//System.out.println(empCheck);
		return empCheck;

	}
	//Method to check whether employee present or not
	private static void checkEmpPresentOrNot(int is_fulltime) {
		//Generate random number for 0 for absent 1 for present
		int empCheck=(int)Math.floor(Math.random()*10) % 2;
		//System.out.println(empCheck);

		//if condition to check employee is present for the input is_fulltime=1
		if(empCheck==is_fulltime) {
			System.out.println("Employee is Present");
		}
		//else condition to check employee is absent for the input is_fulltime=0
		else
			System.out.println("Employee is Absent");
	}

	private static void calculateDailyWage(int is_fulltime) {
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
	private static void calculateDailyWage(int fulltime, int parttime) {

		int empCheck=0;
		int empHrs=0;
		int empWage=0;
		empCheck=getRandomNumber(empCheck);
		//System.out.println(empCheck);
		if(empCheck==fulltime) 
			empHrs=8;
		else if(empCheck==parttime)
			empHrs=4;
		else
			empHrs=0;

		empWage= emp_rate_per_hour * empHrs;

		System.out.println("Emp Wage is "+empWage);

	}
	private static void calculateDailyWageUsingSwitch(int fulltime, int parttime) {

		int empCheck=0;
		int empHrs=0;
		int empWage=0;
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

		System.out.println("Emp Wage is "+empWage);

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
		Scanner sc=new Scanner(System.in);
		//declaring constants
		int is_fulltime=1;

		//declaring constants
		final int fulltime=2;
		final int parttime=1;

		//declaring variables
		int empCheck=0;
		checkEmpPresentOrNot(is_fulltime);
		calculateDailyWage(is_fulltime);


		System.out.println("1. Would like to know Whether Employee Present ot Not?");
		System.out.println("2. Would like to know Daily Wage of the employee ?");
		System.out.println("3. Calculate Part time and Full time Daily wage ?");
		System.out.println("4. Calculate Daily Wage Using Switch Case ?");
		System.out.println("5. Calculate Monthly Wage Of Employee ?");
		System.out.println("6. Calculate Total Employee  Wage Using While Condition ?");
		System.out.println("What you are looking for? Select the option from below :");

		int option=sc.nextInt();
		switch(option) 
		{
		case 1:
			checkEmpPresentOrNot(is_fulltime);

			 break;
		case 2:
			calculateDailyWage(is_fulltime);

			break;
		case 3:
			calculateDailyWage(parttime,fulltime);

			break;
		case 4:
			calculateDailyWageUsingSwitch(parttime,fulltime);

			break;
		case 5:
			calculateMonthlyWageUsingSwitch(parttime,fulltime);

			break;
		case 6:
			calculateMonthlyWageUsingWhile(parttime,fulltime);

			break;
		
	}
		sc.close();
	}
}


package com.bridgelabz;

public class EmpWageCalcUC1 {


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




	public static void main(String[] args) {
		//declaring constants
		int is_fulltime=1;
		checkEmpPresentOrNot(is_fulltime);

	}
}


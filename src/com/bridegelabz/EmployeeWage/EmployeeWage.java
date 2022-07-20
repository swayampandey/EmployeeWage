package com.bridegelabz.EmployeeWage;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("********************************************");
		/*
		 * Added UC1
		 */
		int EmployeePresent=1;
		int isPresent =(int) Math.floor(Math.random()*10) % 2;
		if (isPresent == EmployeePresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
			

	}

}

package com.bridegelabz.EmployeeWage;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("********************************************");
		/*
		 * Added UC4
		 */
		int WagePerHour=20;
		int FullDayHour=8;
		int PartTimeHour=4;
		int isPresent =(int) Math.floor(Math.random()*10) % 3;
		switch (isPresent) {
		
		case 0: 
			System.out.println("Employee is Absent");
			System.out.println("Employee Wage for a day is 0 ");
			break;
		case 1:
			System.out.println("Employee is Present");
			System.out.println("Employee Wage for a day is " +WagePerHour*FullDayHour);
			break;
		case 2:
			System.out.println("Employee is doing part time");
			System.out.println("Employee Wage for a day is " +WagePerHour*PartTimeHour);
			break;
		
		}
		

	}

}

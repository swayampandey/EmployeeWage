package com.bridegelabz.EmployeeWage;

public class EmployeeWage {
	public static final int PartTime=1;
	public static final int FullTime=2;
	public static final int RatePerHour=20;
	public static final int WorkingDays=20;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("********************************************");
		/*
		 * Refactoring  UC5
		 */
		// variables
		int EmpHours=0, EmpWage=0, TotalEmpWage=0;
		for(int day=0; day<WorkingDays; day++) {
			int isPresent= (int)Math.floor(Math.random()*10)%3;
			switch(isPresent) {
			
			case PartTime:
				EmpHours=4;
				break;
			case FullTime:
				EmpHours=8;
				break;
			default:
				EmpHours=0;
				}
			EmpWage= EmpHours*RatePerHour;
			TotalEmpWage +=EmpWage;
			System.out.println("Employee Wage = " +EmpWage);
		}
			System.out.println("Total Employee Wage  = " +TotalEmpWage);
		
		}
		

	}


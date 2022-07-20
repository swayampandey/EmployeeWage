package com.bridegelabz.EmployeeWage;

public class EmployeeWage {
	public static final int EmployeePresent=1;
	public static final int EmployeePartTime=2;
	public static final int WagePerHour=20;
	public static final int WorkingDays=20;
	public static final int MonthMaxHours=100;
	

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("********************************************");
		/*
		 * Added UC6
		 */
		int numberOfHours=0;
		int EmpWagePerDay=0, nHours=0;
		int totalWorkingDays=0, totalWorkingHours=0;
		int totalEmployeeWage=0;
		while(totalWorkingHours<MonthMaxHours && totalWorkingDays<WorkingDays) {
		int isPresent =(int) Math.floor(Math.random()*10) % 3;
		switch (isPresent) {
		
		case EmployeePresent: 
			numberOfHours= 8;
			totalWorkingHours= totalWorkingHours + numberOfHours;
			System.out.println("Employee is Present");
			System.out.println("Employee Wage for a day is "+numberOfHours*WagePerHour);
			totalWorkingDays++;
			nHours+=numberOfHours;
			break;
			
		case EmployeePartTime:
			numberOfHours= 4;
			totalWorkingHours= totalWorkingHours + numberOfHours;
			System.out.println("Employee is doing part time");
			System.out.println("Employee part time wage for a day is "+numberOfHours*WagePerHour);
			totalWorkingDays++;
			nHours+=numberOfHours;
			break;
		
		default :
			numberOfHours= 0;
			totalWorkingHours= totalWorkingHours + numberOfHours;
			System.out.println("Employee is Absent");
			System.out.println("Employee Wage for day is 0");
			break;
			}
		System.out.println("\ndays  = " + totalWorkingDays + " No. of Hours = " +nHours);
		System.out.println(	"\nEmployee Monthly Earn for Max"
				+ " Days or Hours = " + ((numberOfHours) * WagePerHour) * WorkingDays);
		
		totalEmployeeWage= totalWorkingHours * WagePerHour;
		System.out.println("\nTotal Employee Wage without Condition is "+ totalEmployeeWage);
		

		}

	}
}

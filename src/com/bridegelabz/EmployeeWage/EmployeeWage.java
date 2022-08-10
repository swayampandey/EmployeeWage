package com.bridegelabz.EmployeeWage;

public class EmployeeWage {
	
	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int RatePerHour = 20;
	public static final int WorkingDays = 20;
	public static final int MaxHoursInMonth = 100;
	
	void wageComputation() {

		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("********************************************");
		
		int EmpHours = 0, TotalEmpHours = 0, TotalWorkingDays = 0;
		while(TotalEmpHours <= MaxHoursInMonth && TotalWorkingDays < WorkingDays ) {
			TotalWorkingDays++;
			int isPresent = (int)Math.floor(Math.random()*10)%3;
			switch(isPresent) {
			
			case PartTime:
				EmpHours = 4;
				break;
			case FullTime:
				EmpHours = 8;
				break;
			default:
				EmpHours = 0;
				}
			TotalEmpHours += EmpHours;
			System.out.println("Day : "+ TotalWorkingDays + " Employee Hour : " +EmpHours);
			
		}
			System.out.println("--------------------------");
			int TotalEmpWage= TotalEmpHours*RatePerHour;
			System.out.println("Total Employee Wage : " +TotalEmpWage);
		

		
	}
	
	public static void main(String[] args) {
		EmployeeWage obj = new EmployeeWage();
		obj.wageComputation();
				}
		

	}
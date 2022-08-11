package com.bridegelabz.EmployeeWage;

public class EmployeeWage {
	
	public static final int PartTime = 1;
	public static final int FullTime = 2;
	private static  String company;
	private static  int RatePerHour;
	private static  int WorkingDays;
	private static  int MaxHoursInMonth;
	
	
	// creating constructor
	
	public EmployeeWage(String company, int RatePerHour, int WorkingDays, int MaxHoursInMonth) {
		this.company = company;
		this.RatePerHour = RatePerHour;
		this.WorkingDays = WorkingDays;
		this.MaxHoursInMonth = MaxHoursInMonth;
			
	}
	
	static void display() {

		System.out.println("Welcome to Employee Wage Computation\nProgram for multiple companies");
		System.out.println("********************************************");
		

		
	}
	
	private int computeEmpWage() {
		
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
		return TotalEmpHours * RatePerHour;
		
	}
	
	
	
	public static void main(String[] args) {
		
		display();
		EmployeeWage dMart = new EmployeeWage("dMart", 20, 20, 150);
		EmployeeWage Reliance = new EmployeeWage("Reliance", 25, 18, 150);
		
		
		System.out.println("Total EmpWage for Company " + dMart.company + " is " +dMart.computeEmpWage());
		System.out.println("----------------------------------------------------------");
		System.out.println("Total EmpWage for Company " + Reliance.company + " is : " +dMart.computeEmpWage());
			
	
	
				}
		

	}
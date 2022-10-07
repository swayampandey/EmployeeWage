package com.bridgelabz;

import java.util.*;

public class EmployeeWageMain {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HOURS_IN_MONTH = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program\n");

		int empHour = 0;
		int totalEmpHours = 0;
		int totalWorkingDays = 0;
		
		while(totalEmpHours <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
		
			totalWorkingDays++;
		Random random = new Random();
		int attendance = random.nextInt(3);
		switch (attendance) {
		case IS_PART_TIME:
			System.out.println("Part Time");
			empHour = 4;
			
			break;
		case IS_FULL_TIME:
			System.out.println("Full Time ");
			empHour = 8;
			
			break;
		default:
			System.out.println("ABSENT");
			empHour = 0;
			
		}
		totalEmpHours += empHour;
		System.out.println("Day "+totalWorkingDays+ " Emp Hour: "+empHour);
		
		}
		int totalEmpWage = totalEmpHours * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage : " + totalEmpWage);

	}

}

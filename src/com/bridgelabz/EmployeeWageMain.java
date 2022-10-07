package com.bridgelabz;

import java.util.*;

public class EmployeeWageMain {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program\n");

		int empHour = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		/**
		 * Generating random number using random class random.nextInt(2) will generate
		 * random number between 0 and 3
		 */
		for(int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
		Random random = new Random();
		int attendance = random.nextInt(3);
		switch (attendance) {
		case IS_PART_TIME:
			empHour = 4;
			System.out.println("Day "+day+ " Part Time");
			break;
		case IS_FULL_TIME:
			empHour = 8;
			System.out.println("Day "+day+ " Full Time ");
			break;
		default:
			empHour = 0;
			System.out.println("Day "+day+" ABSENT");
		}
		empWage = empHour * EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println("Day "+day+" Emp Wage : " +empWage);
		}
		System.out.println("Total Emp Wage : " + totalEmpWage);

	}

}

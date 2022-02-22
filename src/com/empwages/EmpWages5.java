package com.empwages;

public class EmpWages5 {

	public static void empinfo() {
		final int wagesperhrs = 120, workingday = 20;
		int empHrs = 0, dailywages = 0;
		int monthlyWage = 0;
		// number for 0 for absent 1 for present
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		// looping for n working days
		for (int day = 1; day <= workingday; day++) {
			// Switch to check employee is working full time, part time or absent
			switch (empCheck) {
			case 0:
				empHrs = 0;// Employee absent
				break;
			case 1:
				empHrs = 4;// Employee Parttime present
				break;
			default:
				empHrs = 8;// Employee Fulltime present
				break;
			}
			// Calculating Daily Wages and Monthly Wages of employee
			dailywages = wagesperhrs * empHrs;
			monthlyWage = monthlyWage + dailywages;
		}
		System.out.println("Employee Wage daily is " + dailywages + " and Monthly Wage is " + monthlyWage);

	}

	public static void main(String[] args) {
		// declaring constants
		empinfo();
	}
}

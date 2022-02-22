package com.empwages;

public class EmpWages6 {

	public static void empinfo() {
		final int wagesperhrs = 120, workingday = 20;
		int dailywages = 0;
		int monthlyWage = 0;

		// looping for n working days
		int totalempHrs = 0;
		int totalworkingdays = 0;
		int workinghours = 100;

		while (totalempHrs <= workinghours && totalworkingdays <= workingday) {
			int empHrs = 0;
			totalworkingdays++;
			// number for 0 for absent 1 for present
			int empCheck = (int) Math.floor(Math.random() * 10) % 2;
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
			// Calculating Daily Wages, Monthly Wages and Total Wages of employee

			dailywages = wagesperhrs * empHrs;
			monthlyWage = monthlyWage + dailywages;
			totalempHrs += monthlyWage;
		}
		System.out.println("Employee dailywages is " + dailywages + ", Monthly wages is " + monthlyWage
				+ " and total wages is " + totalempHrs);
	}

	public static void main(String[] args) {
		// declaring constants
		empinfo();
	}
}
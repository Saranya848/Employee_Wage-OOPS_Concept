package com.empwages;

public class EmpWages4 {

	public static void empdata() {
		final int wagesperhrs = 20;
		int empHrs = 0;
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
		// Daily Wages for part time
		int dailywages = wagesperhrs * empHrs;
		System.out.println("Employee Wage is " + dailywages);

	}

	public static void main(String[] args) {
		// declaring constants
		empdata();
	}
}

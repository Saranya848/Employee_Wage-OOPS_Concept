package com.empwages;

public class EmpWages2 {

	public static void empdata(int fulltime, int parttime) {
		final int wagesperhrs = 20;
		int empHrs = 0;
		// number for 0 for absent 1 for present
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		// System.out.println(empCheck);

		// if condition to check employee is working full time, part time or absent
		if (empCheck == fulltime)
			empHrs = 8;
		else if (empCheck == parttime)
			empHrs = 4;
		else
			empHrs = 0;
		// Calculating daily wages
		int dailywages = wagesperhrs * empHrs;
		System.out.println("Employee Wage is " + dailywages);

	}

	public static void main(String[] args) {
		int parttime = 1, fulltime = 2;
		// declaring constants
		empdata(parttime, fulltime);
	}
}

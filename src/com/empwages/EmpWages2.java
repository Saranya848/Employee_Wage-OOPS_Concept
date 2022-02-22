package com.empwages;

public class EmpWages2 {

	private void empdata() {
		final int fullperhrs = 8;
		final int wagesperhrs = 20;
		int isfulltime = 1;
		int empHrs = 0;
		// number for 0 for absent 1 for present
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		// System.out.println(empCheck);

		// if condition to check employee is present for 1
		if (empCheck == 1) {
			System.out.println("Employee is Present");
			if (empCheck == isfulltime)
				empHrs = 8;
			else
				empHrs = 4;
			int dailywages = fullperhrs * wagesperhrs;
			System.out.println("Employee Wage is " + dailywages);
			
		}

		// else condition to check employee is absent for 0
		else
			System.out.println("Employee is Absent");
		

	}

	public static void main(String[] args) {
		EmpWages2 ew = new EmpWages2();
		// declaring constants
		ew.empdata();
	}

}

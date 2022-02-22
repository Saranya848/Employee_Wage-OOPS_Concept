package com.empwages;

public class EmpWages1 {
	private void empstatus() {
		// number for 0 for absent 1 for present
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		// System.out.println(empCheck);

		// if condition to check employee is absent for 0
		if (empCheck == 0) {
			System.out.println("Employee is Absent");
		}

		// else condition to check employee is present for 1
		else
			System.out.println("Employee is Present");
	}

	public static void main(String[] args) {
		EmpWages1 ew = new EmpWages1();
		// declaring constants
		ew.empstatus();
	}

}

package com.roughInfinity.model;

public class Employee {

	private int empId;
	private String empName;
	private double empSal;
	private String empBU;
	private int empAge;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double empSal, String empBU, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empBU = empBU;
		this.empAge = empAge;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getEmpBU() {
		return empBU;
	}

	public void setEmpBU(String empBU) {
		this.empBU = empBU;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}

package com.roughInfinity.model;

public class Employee {

	private int empId;
	private String empName;
	private double empSal;
	private SBU bussinessUnit;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double empSal, String empBU, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	
//	public SBU getBussinessUnit() {
//		return bussinessUnit;
//	}
	
	public SBU getSBUDetails() {
		return bussinessUnit;
	}

	public void setBussinessUnit(SBU bussinessUnit) {
		this.bussinessUnit = bussinessUnit;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}

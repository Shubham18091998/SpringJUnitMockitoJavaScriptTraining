package com.cts.model;

public class Employee {
	private int empNo;
	private String name;
	private String salary;
	public Employee() {
		super();
	}
	public Employee(int empNo, String name, String salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "empNo=" + empNo + ", name=" + name + ", salary=" + salary;
	}
	
}

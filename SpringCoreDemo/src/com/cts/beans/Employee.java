package com.cts.beans;

public class Employee {
	
	private int empno;
	private String name;
	private int salary;
	private Address address;
	public Employee() {
		super();
	}
	public Employee(int empno, String name, int salary, Address address) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "empno=" + empno + ", name=" + name + ", salary=" + salary + ", address=" + address;
	}
	

}

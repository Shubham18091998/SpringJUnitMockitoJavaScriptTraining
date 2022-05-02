
package com.cts.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotEmpty;

public class Employee {
	@Min(value=1, message="Employee number must be positive")
	private int empno;
	@NotEmpty(message="Name is required")
	private String name;
	@Min(value=2000, message="Minimum salary must be 2000")
	@Max(value=10000, message="Maximum salary must be 10000")
	private int salary;

	
	public Employee() {
		super();
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
	
	

}
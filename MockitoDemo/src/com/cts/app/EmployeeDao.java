package com.cts.app;

import java.util.ArrayList;

public interface EmployeeDao {
	public void insert(Employee emp);
	public boolean delete(int empno);
	public boolean updateSalary(int empno,int salary);
	public ArrayList<Employee>getAllRecords();
	public Employee getEmployee(int empno);
}

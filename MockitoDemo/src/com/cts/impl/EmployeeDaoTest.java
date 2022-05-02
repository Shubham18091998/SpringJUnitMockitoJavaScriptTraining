package com.cts.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.cts.app.Employee;
import com.cts.app.EmployeeDao;
import com.cts.util.JdbcConnection;

public class EmployeeDaoTest {

	Connection con;
	
	@Rule
	public MockitoRule mockitoRule=MockitoJUnit.rule();
	
	@Mock
	EmployeeDao empDaoMock;
	
	
	@Before
	public void setUp() {
		con=JdbcConnection.getConnection();
	}
	
	@After
	public void tearDown() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAllRecords() {
		Employee emp1 = null,emp2 = null,emp3=null;
		ArrayList<Employee>employeeList=new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		when(empDaoMock.getAllRecords()).thenReturn(employeeList);
		ArrayList<Employee>empList=empDaoMock.getAllRecords();
		assertEquals(2, empList.size());
	}

}

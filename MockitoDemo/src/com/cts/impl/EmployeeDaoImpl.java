package com.cts.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cts.app.Employee;
import com.cts.app.EmployeeDao;
import com.cts.util.JdbcConnection;

public class EmployeeDaoImpl implements EmployeeDao{

		@Override
		public void insert(Employee emp) {
			// TODO Auto-generated method stub
			Connection con=JdbcConnection.getConnection();
			PreparedStatement pst=null;
			try {
				String query="insert into employee values(?,?,?,?,?,?)";
				pst=con.prepareStatement(query);
				int empno=emp.getEmpno();
				String name=emp.getName();
				int salary=emp.getSalary();
				String email=emp.getEmail();
				String city=emp.getCity();
				int deptno=emp.getDeptno();
				pst.setInt(1, empno);
				pst.setString(2, name);
				pst.setInt(3,salary);
				pst.setString(4, email);
				pst.setString(5, city);
				pst.setInt(6, deptno);
				//System.out.println(query);
				int rec=pst.executeUpdate();
				if(rec==1) {
					System.out.println("Record sucessfully inserted");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		@Override
		public boolean delete(int empno) {
			// TODO Auto-generated method stub
			Connection con=JdbcConnection.getConnection();
			PreparedStatement pst=null;
			try {
				String query="delete from employee where empno=?";
				pst=con.prepareStatement(query);
				//System.out.println(query);
				pst.setInt(1,empno);
				int rec=pst.executeUpdate();
				if(rec==1) {
					System.out.println("Record deleted sucessfully");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}

		@Override
		public boolean updateSalary(int empno, int salary) {
			// TODO Auto-generated method stub
			Connection con=JdbcConnection.getConnection();
			PreparedStatement pst=null;
			try {
				String query="update employee set salary=? where empno=?";
				pst=con.prepareStatement(query);
				//System.out.println(query);
				pst.setInt(1, salary);
				pst.setInt(2, empno);
				int rec=pst.executeUpdate();
				if(rec==1) {
					System.out.println("Record updated sucessfully");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}

		@Override
		public ArrayList<Employee> getAllRecords() {
			// TODO Auto-generated method stub
			ArrayList<Employee>empList=new ArrayList<>();
			Connection con=JdbcConnection.getConnection();
			PreparedStatement pst=null;
			ResultSet rs=null;
			try {
				String query="select * from employee";
				pst=con.prepareStatement(query);
				//System.out.println(query);
				rs=pst.executeQuery();
				while(rs.next()) {
					int empno=rs.getInt(1);
					String name=rs.getString(2);
					int salary=rs.getInt(3);
					String email=rs.getString(4);
					String city=rs.getString(5);
					int deptno=rs.getInt(6);
					Employee emp=new Employee(empno,name,salary,email,city,deptno);
					empList.add(emp);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return empList;
		}

		@Override
		public Employee getEmployee(int empno) {
			// TODO Auto-generated method stub
			Connection con=JdbcConnection.getConnection();
			PreparedStatement pst=null;
			ResultSet rs=null;
			Employee emp=null;
			try {
				String query="select * from employee where empno=?";
				pst=con.prepareStatement(query);
				//System.out.println(query);
				pst.setInt(1, empno);
				rs=pst.executeQuery();
				if(rs.next()) {
					String name=rs.getString(2);
					int salary=rs.getInt(3);
					String email=rs.getString(4);
					String city=rs.getString(5);
					int deptno=rs.getInt(6);
					emp=new Employee(empno,name,salary,email,city,deptno);
					return emp;
					
				}
				else {
					return null;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

}

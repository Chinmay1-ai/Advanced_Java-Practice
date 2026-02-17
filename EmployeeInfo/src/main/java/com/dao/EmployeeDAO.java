package com.dao;

import java.sql.*;
import com.pojo.Employeepojo;

public class EmployeeDAO {

	public void fetchAllRecord() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		PreparedStatement ps = c.prepareStatement("select * from employee");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt("emp_id") + "  " + rs.getString("name") + "  " + rs.getString("email") + "  " + rs.getString("city") + "  " + rs.getInt("age"));
		}
		c.close();
	}

	public void fetchParticularRecord(Employeepojo p, int id ) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		PreparedStatement ps = c.prepareStatement("select * from employee where emp_id =  ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			
			System.out.println(rs.getInt("emp_id") + "  " + rs.getString("name") + "  " + rs.getString("email") + "  "+ rs.getString("city") + "  " + rs.getInt("age"));
		}
		c.close();
	}

	public void insertData(Employeepojo p) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		PreparedStatement ps = c.prepareStatement("insert into employee(name,email,city,age) values(?,?,?,?)");

		ps.setString(1, p.getName());
		ps.setString(2, p.getEmail());
		ps.setString(3, p.getCity());
		ps.setInt(4, p.getAge());

		int check = ps.executeUpdate();

		if (check > 0)
			System.out.println("Data Inserted Successfully!");
		else
			System.out.println("Insert Failed!");

		c.close();
	}

	public void updateData(Employeepojo p) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		PreparedStatement ps = c.prepareStatement("update employee set gender=?, salary=? where emp_id=?");

		ps.setString(1, p.getGender());
		ps.setLong(2, p.getSalary());
		ps.setInt(3, p.getEmp_id());

		int check = ps.executeUpdate();

		if (check > 0)
			System.out.println("Data Updated Successfully!");
		else
			System.out.println("Update Failed!");

		c.close();
	}

	public void deleteData(Employeepojo p) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		PreparedStatement ps = c.prepareStatement("delete from employee where emp_id=?");

		ps.setInt(1, p.getEmp_id());

		int check = ps.executeUpdate();

		if (check > 0)
			System.out.println("Data Deleted Successfully!");
		else
			System.out.println("Delete Failed!");

		c.close();
	}
}

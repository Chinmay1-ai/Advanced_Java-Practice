package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pojo.DoctorPojo;

public class DoctorDAO {

	Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital","root","root");	
	}
	
	 public void insertDoctor(DoctorPojo d) throws Exception {

	        Connection c = getConnection();

	        PreparedStatement ps = c.prepareStatement(
	            "insert into doctor(name,email,phone,specialization,experience,gender,salary,joining_date,status) values(?,?,?,?,?,?,?,?,?)"
	        );

	        ps.setString(1, d.getName());
	        ps.setString(2, d.getEmail());
	        ps.setString(3, d.getPhone());
	        ps.setString(4, d.getSpecialization());
	        ps.setInt(5, d.getExperience());
	        ps.setString(6, d.getGender());
	        ps.setDouble(7, d.getSalary());
	        ps.setString(8, d.getJoining_date());
	        ps.setString(9, d.getStatus());

	        ps.executeUpdate();

	        System.out.println("Doctor Inserted Successfully!");
	        c.close();
	    }

	    public void fetchAllDoctors() throws Exception {
	        Connection c = getConnection();

	        PreparedStatement ps = c.prepareStatement("select * from doctor");
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            System.out.println(
	                rs.getInt("doctor_id") + " " +
	                rs.getString("name") + " " +
	                rs.getString("specialization")
	            );
	        }

	        c.close();
	    }
	}


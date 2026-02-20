package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.pojo.PatientPojo;

public class PatientDAO {
	Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "root");
	}

	public void insertPatient(PatientPojo p) throws Exception {
		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement(
				"INSERT INTO patient(name,email,phone,age,gender,disease,admission_date,doctor_id,bill_amount) VALUES(?,?,?,?,?,?,?,?,?)");

		ps.setString(1, p.getName());
		ps.setString(2, p.getEmail());
		ps.setString(3, p.getPhone());
		ps.setInt(4, p.getAge());
		ps.setString(5, p.getGender());
		ps.setString(6, p.getDisease());
		ps.setString(7, p.getAdmission_date());
		ps.setInt(8, p.getDoctor_id());
		ps.setDouble(9, p.getBill_amount());

		ps.executeUpdate();
		System.out.println("Patient Inserted Successfully!");
		c.close();
	}

	public void fetchPatients() throws Exception {
		Connection c = getConnection();
		PreparedStatement ps = c.prepareStatement("SELECT * FROM patient");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt("patient_id") + " " + rs.getString("name") + " " + rs.getString("disease"));
		}

		c.close();
	}
}
package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws  Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		
		Statement s = con.createStatement();
		
		s.executeUpdate("insert into student(id,name,city,mob,gender)values(101,'Chinmay','pune',123464627,'Male')");
		
		System.out.println("successfully inserted");
		con.close();

	}

}
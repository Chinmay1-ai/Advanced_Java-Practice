package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\Users\\asus\\OneDrive\\Desktop\\Java\\employee.txt");
		ObjectInputStream ois = new ObjectInputStream(file);

		Employee e = (Employee) ois.readObject();

		System.out.println("Employee Name : " + e.name);
		System.out.println("Employee ID : " + e.empId);
		System.out.println("Employee City : " + e.city);

		ois.close();
		file.close();
	}
}

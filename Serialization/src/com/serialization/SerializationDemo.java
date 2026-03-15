package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee(121, "Chinmay", "Pune");

		FileOutputStream file = new FileOutputStream("C:\\Users\\asus\\OneDrive\\Desktop\\Java\\employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(file);

		oos.writeObject(e);

		oos.close();
		file.close();

		System.out.println("File is Succesfully Created.........!!");
	}
}

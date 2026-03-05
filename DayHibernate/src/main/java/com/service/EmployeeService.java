package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeService {

	public void insertData(Employee e) {
		EmployeeDao dao = new EmployeeDao();
		dao.inserData(e);
	}

	public void deleteData(int id) {
		EmployeeDao dao = new EmployeeDao();
		dao.deleteData(id);
	}

	public void updateData(Employee e) {
		EmployeeDao dao = new EmployeeDao();
		dao.updateData(e);
	}
	
	public void getSingleRecord(int id) {
		EmployeeDao dao = new EmployeeDao();
		dao.getSingleRecord(id);
	}

}

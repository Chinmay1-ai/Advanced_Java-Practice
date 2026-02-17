package com.service;

import com.dao.EmployeeDAO;
import com.pojo.Employeepojo;

public class EmployeeService {

	public void insertData(Employeepojo p) throws Exception {
		EmployeeDAO sd = new EmployeeDAO();
		sd.insertData(p);
	}

	public void updateData(Employeepojo p) throws Exception {
		EmployeeDAO sd = new EmployeeDAO();
		sd.updateData(p);
	}

	public void deleteData(Employeepojo p) throws Exception {
		EmployeeDAO sd = new EmployeeDAO();
		sd.deleteData(p);
	}

	public void fetchAllData() throws Exception {
		EmployeeDAO sd = new EmployeeDAO();
		
		sd.fetchAllRecord();
	}
	public void fetchParticularRecord(Employeepojo p , int id ) throws Exception {
		EmployeeDAO sd = new EmployeeDAO();
		sd.fetchParticularRecord(p,id);
	}

}

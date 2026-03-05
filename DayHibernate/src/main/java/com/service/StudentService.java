package com.service;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

	public void insertData(Student e) {
		StudentDao dao = new StudentDao();
		dao.inserData(e);
	}

	public void deleteData(int id) {
		StudentDao dao = new StudentDao();
		dao.deleteData(id);
	}

	public void updateData(Student e) {
		StudentDao dao = new StudentDao();
		dao.updateData(e);
	}

	public void getSingleRecord(int id) {
		StudentDao dao = new StudentDao();
		dao.getSingleRecord(id);
	}

}

package com.service;

import com.dao.PersonsDao;

public class PersonsService {

	public void insertData() {
		PersonsDao dao = new PersonsDao();
		dao.insertData();
	}

	public void deleteData() {
		PersonsDao dao = new PersonsDao();
		dao.deleteData();
	}

	public void updateData() {
		PersonsDao dao = new PersonsDao();
		dao.updateData();
	}

	public void getAllRecord() {
		PersonsDao dao = new PersonsDao();
		dao.getAllRecord();
	}

}

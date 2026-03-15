package com.service;

import com.dao.LibraryDao;
import com.entity.Library;

public class LibraryService {

	public void insertData(Library l) {
		LibraryDao dao = new LibraryDao();
		dao.insertData(l);
	}
	public void deleteData(int id) {
		LibraryDao dao = new LibraryDao();
		dao.deleteData(id);
	}

	public void updateData(Library l) {
		LibraryDao dao = new LibraryDao();
		dao.updateData(l);
	}

	public void getSingleRecord(int id) {
		LibraryDao dao = new LibraryDao();
		dao.getSingleRecord(id);
	}
	
	public void getAllRecord() {
		LibraryDao dao = new LibraryDao();
		dao.getAllRecord();
	}

}

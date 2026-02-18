package com.service;

import com.dao.DoctorDAO;
import com.pojo.DoctorPojo;

public class DoctorService {

	 DoctorDAO dao = new DoctorDAO();

	    public void insertDoctor(DoctorPojo d) throws Exception {
	        dao.insertDoctor(d);
	    }

	    public void fetchAllDoctors() throws Exception {
	        dao.fetchAllDoctors();
	    }
	}

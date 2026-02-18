package com.service;

import com.dao.PatientDAO;
import com.pojo.PatientPojo;

public class PatientService {

	PatientDAO dao = new PatientDAO();

	public void insertPatient(PatientPojo p) throws Exception {
		dao.insertPatient(p);
	}

	public void fetchPatients() throws Exception {
		dao.fetchPatients();
	}
}

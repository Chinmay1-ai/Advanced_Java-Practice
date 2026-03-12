package com.implementation;

import com.dao.PatientDAO;
import com.pojo.PatientPojo;
import com.service.PatientService;

public class PatientServiceImpl implements PatientService {

	PatientDAO dao = new PatientDAO();

	@Override
	public void insertPatient(PatientPojo p) throws Exception {
		dao.insertPatient(p);
	}

	@Override
	public void fetchPatients() throws Exception {
		dao.fetchPatients();
	}
}

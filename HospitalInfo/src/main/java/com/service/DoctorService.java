package com.service;

import com.pojo.DoctorPojo;


	public interface DoctorService {

	    void insertDoctor(DoctorPojo d) throws Exception;

	    void fetchAllDoctors() throws Exception;
	    
	    public int getDoctorBySpecialization(String specialization) throws Exception;
	    
	    int findDoctorByDisease(String disease) throws Exception;

	}
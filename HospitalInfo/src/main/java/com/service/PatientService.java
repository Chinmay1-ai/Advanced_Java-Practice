package com.service;

import com.pojo.PatientPojo;

public interface PatientService {

    void insertPatient(PatientPojo p) throws Exception;

    void fetchPatients() throws Exception;
}
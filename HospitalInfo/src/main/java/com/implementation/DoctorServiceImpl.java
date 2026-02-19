package com.implementation;

import com.dao.DoctorDAO;
import com.pojo.DoctorPojo;
import com.service.DoctorService;

public class DoctorServiceImpl implements DoctorService {

    DoctorDAO dao = new DoctorDAO();

    @Override
    public void insertDoctor(DoctorPojo d) throws Exception {
        dao.insertDoctor(d);
    }

    @Override
    public void fetchAllDoctors() throws Exception {
        dao.fetchAllDoctors();
    }
}
package com.hospital;

public class HospitalService {

    public void showDoctorDetails(Doctor d) {
        System.err.println("---- Doctor Details ----");
        System.out.println("Name : " + d.getName());
        System.out.println("Age : " + d.getAge());
        System.out.println("Gender : " + d.getGender());
        System.out.println("Doctor ID : " + d.getDoctorId());
        System.out.println("Specialization : " + d.getSpecialization());
        System.out.println("Fees : " + d.getFees());
    }

    public void showPatientDetails(Patient p) {
        System.err.println("---- Patient Details ----");
        System.out.println("Name : " + p.getName());
        System.out.println("Age : " + p.getAge());
        System.out.println("Gender : " + p.getGender());
        System.out.println("Patient ID : " + p.getPatientId());
        System.out.println("Admitted : " + p.isAdmitted());
    }

    public void checkAdmission(Patient p) {
        if (p.isAdmitted()) {
            System.out.println("Patient is admitted.");
        } else {
            System.out.println("Patient is not admitted.");
        }
    }

    public void calculateBill(Doctor d) {
        System.out.println("Consultation Fees to Pay : " + d.getFees());
    }
}

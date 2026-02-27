package dao;

import model.Patient;
import java.sql.*;
import java.util.*;

public class PatientDAO {

    public static boolean addPatient(Patient p, String password) {

        try {
            Connection con = DBConnection.getConnection();
            con.setAutoCommit(false);

            // 1️⃣ insert into users
            PreparedStatement ps1 = con.prepareStatement(
                "insert into users(full_name,email,password,role) values(?,?,?,'PATIENT')",
                Statement.RETURN_GENERATED_KEYS);

            ps1.setString(1, p.getFullName());
            ps1.setString(2, p.getEmail());
            ps1.setString(3, password);

            ps1.executeUpdate();

            ResultSet rs = ps1.getGeneratedKeys();
            int userId = 0;

            if(rs.next())
                userId = rs.getInt(1);

            // 2️⃣ insert into patients
            PreparedStatement ps2 = con.prepareStatement(
                "insert into patients(user_id,gender,dob,blood_group,phone,address) values(?,?,?,?,?,?)");

            ps2.setInt(1, userId);
            ps2.setString(2, p.getGender());
            ps2.setString(3, p.getDob());
            ps2.setString(4, p.getBloodGroup());
            ps2.setString(5, p.getPhone());
            ps2.setString(6, p.getAddress());

            ps2.executeUpdate();

            con.commit();
            return true;

        } catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
    
    public static List<Patient> getAllPatients(){

        List<Patient> list = new ArrayList<>();

        try{
            Connection con = DBConnection.getConnection();

            String sql =
            "SELECT p.patient_id, u.full_name, u.email, " +
            "p.gender, p.dob, p.blood_group, p.phone, p.address " +
            "FROM patients p JOIN users u ON p.user_id=u.user_id";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){

                Patient p = new Patient(
                    rs.getInt("patient_id"),
                    rs.getString("full_name"),
                    rs.getString("email"),
                    rs.getString("gender"),
                    rs.getString("dob"),
                    rs.getString("blood_group"),
                    rs.getString("phone"),
                    rs.getString("address")
                );

                list.add(p);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }
    
    public static Patient getPatientById(int patientId) {

        Patient p = null;

        try {
            Connection con = DBConnection.getConnection();

            String query =
                "SELECT p.patient_id, u.full_name, u.email, " +
                "p.gender, p.dob, p.blood_group, p.phone, p.address " +
                "FROM patients p " +
                "JOIN users u ON p.user_id = u.user_id " +
                "WHERE p.patient_id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, patientId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p = new Patient();

                p.setPatientId(rs.getInt("patient_id"));
                p.setFullName(rs.getString("full_name"));
                p.setEmail(rs.getString("email"));
                p.setGender(rs.getString("gender"));
                p.setDob(rs.getString("dob"));
                p.setBloodGroup(rs.getString("blood_group"));
                p.setPhone(rs.getString("phone"));
                p.setAddress(rs.getString("address"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return p;
    }
    
    public static boolean updatePatient(Patient p){

        try{
            Connection con = DBConnection.getConnection();

            String sql =
            "update patients set gender=?, dob=?, blood_group=?, phone=?, address=? where patient_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getGender());
            ps.setString(2, p.getDob());
            ps.setString(3, p.getBloodGroup());
            ps.setString(4, p.getPhone());
            ps.setString(5, p.getAddress());
            ps.setInt(6, p.getPatientId());

            ps.executeUpdate();

            return true;

        }catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
    
    public static void deletePatient(int patientId) {

        try {
            Connection con = DBConnection.getConnection();

            // Step 1: get user_id
            PreparedStatement ps1 = con.prepareStatement(
                    "SELECT user_id FROM patients WHERE patient_id=?");
            ps1.setInt(1, patientId);

            ResultSet rs = ps1.executeQuery();

            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt("user_id");
            }

            // Step 2: delete patient
            PreparedStatement ps2 = con.prepareStatement(
                    "DELETE FROM patients WHERE patient_id=?");
            ps2.setInt(1, patientId);
            ps2.executeUpdate();

            // Step 3: delete user
            PreparedStatement ps3 = con.prepareStatement(
                    "DELETE FROM users WHERE user_id=?");
            ps3.setInt(1, userId);
            ps3.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
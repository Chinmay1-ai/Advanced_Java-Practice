package dao;

import model.Doctor;
import java.sql.*;
import java.util.*;

public class DoctorDAO {

    public static boolean addDoctor(Doctor doctor, String password) {

        try {
            Connection con = DBConnection.getConnection();
            con.setAutoCommit(false);

            // Insert into users
            PreparedStatement ps1 = con.prepareStatement(
                    "INSERT INTO users (full_name, email, password, role) VALUES (?, ?, ?, 'DOCTOR')",
                    Statement.RETURN_GENERATED_KEYS);

            ps1.setString(1, doctor.getFullName());
            ps1.setString(2, doctor.getEmail());
            ps1.setString(3, password);
            ps1.executeUpdate();

            ResultSet rs = ps1.getGeneratedKeys();
            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt(1);
            }

            // Insert into doctors
            PreparedStatement ps2 = con.prepareStatement(
                    "INSERT INTO doctors (user_id, specialization, experience, dept_id) VALUES (?, ?, ?, ?)");

            ps2.setInt(1, userId);
            ps2.setString(2, doctor.getSpecialization());
            ps2.setInt(3, doctor.getExperience());
            ps2.setInt(4, doctor.getDeptId());

            ps2.executeUpdate();

            con.commit();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public static List<Doctor> getAllDoctors() {
        List<Doctor> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();
            String query = "SELECT d.doctor_id, u.full_name, u.email, d.specialization, d.experience, d.dept_id " +
                           "FROM doctors d JOIN users u ON d.user_id = u.user_id";

            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Doctor doc = new Doctor(
                        rs.getInt("doctor_id"),
                        rs.getString("full_name"),
                        rs.getString("email"),
                        rs.getString("specialization"),
                        rs.getInt("experience"),
                        rs.getInt("dept_id")
                );
                list.add(doc);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void deleteDoctor(int doctorId) {
        try {
            Connection con = DBConnection.getConnection();

            // Get user_id first
            PreparedStatement ps1 = con.prepareStatement(
                    "SELECT user_id FROM doctors WHERE doctor_id=?");
            ps1.setInt(1, doctorId);
            ResultSet rs = ps1.executeQuery();

            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt("user_id");
            }

            PreparedStatement ps2 = con.prepareStatement(
                    "DELETE FROM doctors WHERE doctor_id=?");
            ps2.setInt(1, doctorId);
            ps2.executeUpdate();

            PreparedStatement ps3 = con.prepareStatement(
                    "DELETE FROM users WHERE user_id=?");
            ps3.setInt(1, userId);
            ps3.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
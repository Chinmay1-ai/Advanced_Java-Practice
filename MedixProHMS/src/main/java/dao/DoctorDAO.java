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
					"insert into users (full_name, email, password, role) values (?, ?, ?, 'DOCTOR')",
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
					"insert into doctors (user_id, specialization, experience, dept_id) values (?, ?, ?, ?)");

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

	        String sql =
	        	    "SELECT d.doctor_id, u.full_name, u.email, " +
	        	    "d.specialization, d.experience, dep.department_name " +
	        	    "FROM doctors d " +
	        	    "JOIN users u ON d.user_id = u.user_id " +
	        	    "LEFT JOIN departments dep ON d.department_id = dep.department_id";

	        PreparedStatement ps = con.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {

	        	Doctor doctor = new Doctor();

	        	doctor.setDoctorId(rs.getInt("doctor_id"));
	        	doctor.setFullName(rs.getString("full_name"));
	        	doctor.setEmail(rs.getString("email"));
	        	doctor.setSpecialization(rs.getString("specialization"));
	        	doctor.setExperience(rs.getInt("experience"));
	        	doctor.setDepartmentName(rs.getString("department_name"));

	        	list.add(doctor);
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
			PreparedStatement ps1 = con.prepareStatement("select user_id from doctors where doctor_id=?");
			ps1.setInt(1, doctorId);
			ResultSet rs = ps1.executeQuery();

			int userId = 0;
			if (rs.next()) {
				userId = rs.getInt("user_id");
			}

			PreparedStatement ps2 = con.prepareStatement("delete from doctors where doctor_id=?");
			ps2.setInt(1, doctorId);
			ps2.executeUpdate();

			PreparedStatement ps3 = con.prepareStatement("delete from users where user_id=?");
			ps3.setInt(1, userId);
			ps3.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Doctor getDoctorById(int id) {

		Doctor doc = null;

		try {
			Connection con = DBConnection.getConnection();

			String sql = "select d.doctor_id, u.full_name, u.email, " + "d.specialization, d.experience, d.dept_id "
					+ "from doctors d " + "join users u on d.user_id=u.user_id " + "where d.doctor_id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				doc = new Doctor(rs.getInt("doctor_id"), rs.getString("full_name"), rs.getString("email"),
						rs.getString("specialization"), rs.getInt("experience"), rs.getInt("dept_id"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return doc;
	}

	public static void updateDoctor(int id, String specialization, int experience, int deptId) {

		try {
			Connection con = DBConnection.getConnection();

			String sql = "update doctors set specialization=?, experience=?, dept_id=? where doctor_id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, specialization);
			ps.setInt(2, experience);
			ps.setInt(3, deptId);
			ps.setInt(4, id);

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int getDoctorIdByUserId(int userId) {

	    int doctorId = 0;

	    try {
	        Connection con = DBConnection.getConnection();

	        String sql = "SELECT doctor_id FROM doctors WHERE user_id=?";

	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setInt(1, userId);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            doctorId = rs.getInt("doctor_id");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return doctorId;
	}
	
	
}
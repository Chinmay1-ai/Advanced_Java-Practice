package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import model.Appointment;

public class AppointmentDAO {

	public static List<Appointment> getAppointmentsByPatient(int patientId) {

		List<Appointment> list = new ArrayList<>();

		try {
			Connection con = DBConnection.getConnection();

			String sql = "SELECT a.appointment_id, a.appointment_date, " + "a.appointment_time, a.status, "
					+ "u.full_name AS doctor_name " + "FROM appointments a "
					+ "JOIN doctors d ON a.doctor_id = d.doctor_id " + "JOIN users u ON d.user_id = u.user_id "
					+ "WHERE a.patient_id = ? " + "ORDER BY a.appointment_date DESC";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, patientId);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Appointment ap = new Appointment();

				ap.setAppointmentId(rs.getInt("appointment_id"));
				ap.setAppointmentDate(rs.getDate("appointment_date"));
				ap.setAppointmentTime(rs.getTime("appointment_time"));
				ap.setStatus(rs.getString("status"));
				ap.setDoctorName(rs.getString("doctor_name"));

				list.add(ap);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static boolean bookAppointment(int patientId, int doctorId, Date date, Time time) {

		boolean status = false;

		try {
			Connection con = DBConnection.getConnection();

			String sql = "INSERT INTO appointments "
					+ "(patient_id, doctor_id, appointment_date, appointment_time, status) "
					+ "VALUES (?, ?, ?, ?, 'PENDING')";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, patientId);
			ps.setInt(2, doctorId);
			ps.setDate(3, date);
			ps.setTime(4, time);

			int rows = ps.executeUpdate();

			if (rows > 0)
				status = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public static List<Appointment> getDoctorAppointments(int doctorId) {

		List<Appointment> list = new ArrayList<>();

		try {
			Connection con = DBConnection.getConnection();

			String sql = """
					    SELECT a.*, p.full_name
					    FROM appointments a
					    JOIN patients p ON a.patient_id = p.patient_id
					    WHERE a.doctor_id = ?
					    ORDER BY a.appointment_date DESC
					""";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, doctorId);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Appointment a = new Appointment();

				a.setAppointmentId(rs.getInt("appointment_id"));
				a.setPatientName(rs.getString("full_name"));
				a.setAppointmentDate(rs.getDate("appointment_date"));
				a.setAppointmentTime(rs.getTime("appointment_time"));
				a.setStatus(rs.getString("status"));

				list.add(a);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static void updateAppointmentStatus(int id, String status) {

	    try {
	        Connection con = DBConnection.getConnection();

	        String sql =
	                "UPDATE appointments SET status=? WHERE appointment_id=?";

	        PreparedStatement ps = con.prepareStatement(sql);

	        ps.setString(1, status);
	        ps.setInt(2, id);

	        ps.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static List<Appointment> getAppointmentsByDoctor(int doctorId) {

		List<Appointment> list = new ArrayList<>();

		try {
			Connection con = DBConnection.getConnection();

			String sql = """
					    SELECT a.*, u.full_name
					    FROM appointments a
					    JOIN patients p ON a.patient_id = p.patient_id
					    JOIN users u ON p.user_id = u.user_id
					    WHERE a.doctor_id = ?
					    ORDER BY a.appointment_date DESC
					""";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, doctorId);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Appointment a = new Appointment();

				a.setAppointmentId(rs.getInt("appointment_id"));
				a.setPatientName(rs.getString("full_name"));
				a.setAppointmentDate(rs.getDate("appointment_date"));
				a.setAppointmentTime(rs.getTime("appointment_time"));
				a.setStatus(rs.getString("status"));

				list.add(a);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
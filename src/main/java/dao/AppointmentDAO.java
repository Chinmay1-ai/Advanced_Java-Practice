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

	/*
	 * ===================================================== PATIENT APPOINTMENTS
	 * =====================================================
	 */
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

	/*
	 * ===================================================== BOOK APPOINTMENT
	 * =====================================================
	 */
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

			status = ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	/*
	 * ===================================================== ⭐ DOCTOR APPOINTMENTS
	 * (MAIN FIX HERE) =====================================================
	 */
	public static List<Appointment> getAppointmentsByDoctor(int doctorId) {

		List<Appointment> list = new ArrayList<>();

		try {
			Connection con = DBConnection.getConnection();

			String sql = """
					SELECT a.appointment_id,
					       a.patient_id,
					       a.appointment_date,
					       a.appointment_time,
					       a.status,
					       u.full_name
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

				// ⭐ VERY IMPORTANT FIX
				a.setPatientId(rs.getInt("patient_id"));

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

	/*
	 * ===================================================== UPDATE STATUS
	 * =====================================================
	 */
	public static void updateAppointmentStatus(int id, String status) {

		try {
			Connection con = DBConnection.getConnection();

			String sql = "UPDATE appointments SET status=? WHERE appointment_id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, status);
			ps.setInt(2, id);

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * ===================================================== DASHBOARD COUNTS
	 * =====================================================
	 */

	public static int getPendingCount(int doctorId) {

		return getCountByStatus(doctorId, "PENDING");
	}

	public static int getApprovedCount(int doctorId) {

		return getCountByStatus(doctorId, "APPROVED");
	}

	public static int getRejectedCount(int doctorId) {

		return getCountByStatus(doctorId, "REJECTED");
	}

	private static int getCountByStatus(int doctorId, String status) {

		int count = 0;

		try {
			Connection con = DBConnection.getConnection();

			String sql = "SELECT COUNT(*) FROM appointments WHERE doctor_id=? AND status=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, doctorId);
			ps.setString(2, status);

			ResultSet rs = ps.executeQuery();

			if (rs.next())
				count = rs.getInt(1);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}
}
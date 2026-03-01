package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Prescription;

public class PrescriptionDAO {

	public static boolean addPrescription(int appointmentId, int doctorId, int patientId, String medicines,
			String notes) {

		boolean status = false;

		try {
			Connection con = DBConnection.getConnection();

			String sql = "INSERT INTO prescriptions " + "(appointment_id, doctor_id, patient_id, medicines, notes) "
					+ "VALUES (?, ?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, appointmentId);
			ps.setInt(2, doctorId);
			ps.setInt(3, patientId);
			ps.setString(4, medicines);
			ps.setString(5, notes);

			status = ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}
	
	public static List<Prescription> getPrescriptionsByPatient(int patientId) {

	    List<Prescription> list = new ArrayList<>();

	    try {
	        Connection con = DBConnection.getConnection();

	        String sql =
	            "SELECT p.*, u.full_name AS doctor_name " +
	            "FROM prescriptions p " +
	            "JOIN doctors d ON p.doctor_id = d.doctor_id " +
	            "JOIN users u ON d.user_id = u.user_id " +
	            "WHERE p.patient_id=? " +
	            "ORDER BY p.created_at DESC";

	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setInt(1, patientId);

	        ResultSet rs = ps.executeQuery();

	        while(rs.next()){

	            Prescription pr = new Prescription();

	            pr.setPrescriptionId(rs.getInt("prescription_id"));
	            pr.setAppointmentId(rs.getInt("appointment_id"));
	            pr.setDoctorId(rs.getInt("doctor_id"));
	            pr.setPatientId(rs.getInt("patient_id"));
	            pr.setMedicines(rs.getString("medicines"));
	            pr.setNotes(rs.getString("notes"));

	            // NEW FIELD (doctor name)
	            pr.setDoctorName(rs.getString("doctor_name"));

	            list.add(pr);
	        }

	    } catch(Exception e){
	        e.printStackTrace();
	    }

	    return list;
	}
}
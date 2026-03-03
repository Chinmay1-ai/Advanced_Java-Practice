package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.DoctorSlot;

public class DoctorSlotDAO {

	public static List<DoctorSlot> getAvailableSlots(int doctorId, String date) {

		List<DoctorSlot> list = new ArrayList<>();

		try {
			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement(
					"SELECT * FROM doctor_slots " + "WHERE doctor_id=? AND slot_date=? AND is_booked=0");

			ps.setInt(1, doctorId);
			ps.setString(2, date);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				DoctorSlot s = new DoctorSlot();

				s.setSlotId(rs.getInt("slot_id"));
				s.setDoctorId(rs.getInt("doctor_id"));
				s.setSlotDate(rs.getDate("slot_date"));
				s.setSlotTime(rs.getTime("slot_time"));

				list.add(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static void markSlotBooked(int slotId) {

		try {
			Connection con = DBConnection.getConnection();

			String sql = "UPDATE doctor_slots SET is_booked=TRUE WHERE slot_id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, slotId);

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static DoctorSlot getSlotById(int slotId) {

		DoctorSlot slot = null;

		try {
			Connection con = DBConnection.getConnection();

			String sql = "SELECT * FROM doctor_slots WHERE slot_id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, slotId);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				slot = new DoctorSlot();

				slot.setSlotId(rs.getInt("slot_id"));
				slot.setDoctorId(rs.getInt("doctor_id"));
				slot.setSlotDate(rs.getDate("slot_date"));
				slot.setSlotTime(rs.getTime("slot_time"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return slot;
	}

}
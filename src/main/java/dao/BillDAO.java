package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Bill;

public class BillDAO {

	// ================= CREATE BILL =================
	public boolean createBill(int patientId, double amount) {

		boolean success = false;

		try {
			Connection con = DBConnection.getConnection();

			String sql =
			"INSERT INTO bills(patient_id,total_amount,status) VALUES(?,?, 'UNPAID')";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, patientId);
			ps.setDouble(2, amount);

			success = ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return success;
	}

	// ================= GET BILLS =================
	public List<Bill> getBillsByPatient(int patientId) {

		List<Bill> list = new ArrayList<>();

		try {
			Connection con = DBConnection.getConnection();

			String sql =
			"SELECT * FROM bills WHERE patient_id=? ORDER BY bill_id DESC";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, patientId);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Bill b = new Bill();

				b.setBillId(rs.getInt("bill_id"));
				b.setPatientId(rs.getInt("patient_id"));
				b.setTotalAmount(rs.getDouble("total_amount"));
				b.setStatus(rs.getString("status"));

				list.add(b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	// ================= PAY BILL =================
	public boolean updateBillStatus(int billId) {

		boolean success = false;

		try {
			Connection con = DBConnection.getConnection();

			String sql =
			"UPDATE bills SET status='PAID' WHERE bill_id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, billId);

			success = ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return success;
	}
}
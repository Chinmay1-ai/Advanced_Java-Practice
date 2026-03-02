package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {

	public static boolean registerUser(String name, String email, String password, String role) {

		try {
			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("insert into users(full_name,email,password,role) values(?,?,?,?)");

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, role);

			ps.executeUpdate();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}

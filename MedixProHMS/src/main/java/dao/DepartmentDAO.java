package dao;

import java.sql.*;
import java.util.*;
import model.Department;

public class DepartmentDAO {

    public static List<Department> getAllDepartments() {

        List<Department> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/medixpro","root","root");

            String sql = "select * from departments";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Department d = new Department();
                d.setDeptId(rs.getInt("dept_id"));
                d.setDeptName(rs.getString("dept_name"));
                list.add(d);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
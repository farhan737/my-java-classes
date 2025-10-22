package farhan.experiments.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import farhan.util.DatabaseUtil;

public class Lab2210 {
	public static void main(String[] args) {
		String query = "select * from emp";
		Connection conn = DatabaseUtil.getConnection();
		DatabaseUtil.useDatabase("maindata");
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DatabaseUtil.closeConnection();

	}
}

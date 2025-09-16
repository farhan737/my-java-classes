package farhan.experiments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConnection {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connected");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/maindata", "root",
				"farhan93933");
		String query = "SELECT * FROM emp where ename = ?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, "CLARK");
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			System.out.println(
					resultSet.getInt("empno") + "\t" + resultSet.getString("ename") + "\t" + resultSet.getInt("sal"));
		}
	}
}

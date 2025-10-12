package farhan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	// Database credentials
	private static final String URL = "jdbc:mysql://localhost:3306/Library";
	private static final String USER = "root";
	private static final String PASSWORD = "farhan93933";

	static {
		try {
			// Load JDBC driver once
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("JDBC Driver loaded successfully.");
		} catch (ClassNotFoundException e) {
			System.err.println("Error: MySQL JDBC Driver not found.");
			e.printStackTrace();
		}
	}

	// Get a database connection
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

	// Optional: Close connection utility (if not using try-with-resources)
	public static void closeConnection(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("✅ Connection closed.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

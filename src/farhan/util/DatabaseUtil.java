package farhan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseUtil {
	final private static String URL = "jdbc:mysql://localhost:3306/";
	final private static String USERNAME = "root";
	final private static String PASSWORD = "farhan93933";
	private static Connection conn = null;
	
	// load the mysql-connector-j jar package
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	final public static Connection getConnection() {
		try {
			if (conn == null || conn.isClosed()) {
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} else {
				System.err.println("connection busy, close the connection");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	final public static void useDatabase(String databaseName) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.createStatement().execute("USE " + databaseName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	final public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

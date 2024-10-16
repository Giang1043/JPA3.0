package vn.lightforknight.configs;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class DBConnectionMySQL {

	private static Connection conn = null;

	private static String USERNAME = "sa";

	private static String PASSWORD = "014789";

	private static String DRIVER = "com.mysql.cj.jdbc.Driver";

	private static String URL = "jdbc:mysql://@localhost:3306/jpac4";

	public static Connection getDataConnection() throws SQLException {

		try {

			Class.forName(DRIVER);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

		return conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

	}

}

/* package vn.lightforknight.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionMySQL {

    private static Connection conn = null;
    private static String USERNAME = "sa";  // Thay bằng username của SQL Server
    private static String PASSWORD = "014789";  // Thay bằng password của SQL Server
    private static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String URL = "jdbc:sqlserver://localhost:3306;databaseName=jpac4";  // Thay `jpac4` bằng tên cơ sở dữ liệu của bạn

    public static Connection getDataConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
*/
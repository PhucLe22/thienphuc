package vn.iotstar.configs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectMySQL {

	Connection con = null;

	private static String serverName = "DESKTOP-E48HFH6\\PHUCLE";
	private static String dbName = "JAVAWEB";
	private static String portNumber = "1433";
	private static String instance = "";
	private static String userID = "sa";
	private static String password = "131104";

	public Connection getConnection() throws Exception {

		try {
			String url = "jdbc:sqlserver://" + serverName + "\\" + instance + ":" + portNumber + ";databaseName="
					+ dbName;
			if (instance == null || instance.trim().isEmpty())
				url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
			conn = DriverManager.getConnection(url);

			con = DriverManager.getConnection(url, userID, password);
			if (con != null) {
				DatabaseMetaData dm = (DatabaseMetaData) con.getMetaData();
				System.out.println("Driver name: " + dm.getDriverName());
				System.out.println("Driver version: " + dm.getDriverVersion());
				System.out.println("Product name: " + dm.getDatabaseProductName());
				System.out.println("Product version: " + dm.getDatabaseProductVersion());
				
				return con;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		try {
			System.out.println(new DBConnectMySQL().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
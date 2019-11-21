package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBConn {
	//jdbc:mysql://localhost:3306/DB
	//	private final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	//	private final String USER ="kosa";
	//	private final String PASSWORD = "0000";
	// 유저마다 URL, USER, PASSWORD가 달라질 수 있으므로 Properties로 따로 빼서 하도록!

	public Connection conn() {
		Connection conn = null;
		try {
			Properties prop = new Properties();
			String path = "C:\\kosa\\workspace_java\\java_prj\\src\\oracle.properties";
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);

			String URL = (String) prop.get("ORACLE_URL");
			String USER = (String) prop.get("ORACLE_USER");
			String PASSWORD = (String) prop.get("ORACLE_PASSWORD");
			System.out.println(URL + ", " + USER + ", " + PASSWORD);
			Class.forName("oracle.jdbc.driver.OracleDriver"); 

			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void close(Connection conn, 
			PreparedStatement pstmt, 
			ResultSet rs) {
		try {
			if(rs != null)     rs.close();
			if(pstmt != null)  pstmt.close();
			if(conn != null)   conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void close(Connection conn, 
			PreparedStatement pstmt) {
		try {
			if(pstmt != null)  pstmt.close();
			if(conn != null)   conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
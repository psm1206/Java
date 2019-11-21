package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

// JDBC : Java DataBase Connectivity :: 엄연히 말하면 driver가 아니지만 driver라고 표현함.
// ojdbc.jar 파일 : JDK경로에 두는 것(Oracle과 Java 연결)
// Windows에서 쓰는 DB : MSSQL
public class JDBCTest {
	//http://www.naver.com 127.0.0.1
	//		도메인			ip주소
	//jdbc:oracle:thin:@localhost:1521:xe
	//					도메인			xe는 대소문자 구분없음.
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "kosa";
	private final String PASSWORD = "0000";
	public static void main(String[] args) {
		JDBCTest t = new JDBCTest();
		ArrayList<HashMap<String, Object>> list = t.empSelect();
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).get("empno"));
		}	
	}	

	public ArrayList<HashMap<String, Object>> empSelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			String sql = "select * from emp where deptno=? and sal>?";
			// sql문장을 사전에(미리) 메모리에 갖다놔라.
			pstmt = conn.prepareStatement(sql); 
			// 메모리에 올려놓고 바인딩 해줌.
			pstmt.setInt(1, 10);
			pstmt.setInt(2, 100);
			rs = pstmt.executeQuery();
			// next()할 게 있다면..
			while(rs.next()) {
				HashMap<String, Object> map = new HashMap<String, Object>();
				int vempno 		= rs.getInt("empno");
				String vename 	= rs.getString("ename");
				String vjob 	= rs.getString("job");
				map.put("empno", vempno);
				map.put("ename", vename);
				map.put("job", vjob);
				list.add(map);
//				System.out.println(vempno + "," + vename + "," + vjob);
			}	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}

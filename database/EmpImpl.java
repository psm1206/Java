package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import io.UserVO;

public class EmpImpl implements Emp {

	@Override
	public ArrayList<EmpVO> empSelect() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		DBConn db = new DBConn();
		try {
			conn = db.conn();
			String sql = "select * from emp where deptno=? and sal>?";
			pstmt = conn.prepareStatement(sql);
			//바인딩
			pstmt.setInt(1, 10);
			pstmt.setInt(2, 100);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpVO uvo = new EmpVO();
				uvo.setEmpno(rs.getInt("empno"));
				uvo.setEname(rs.getString("ename"));
				uvo.setJob(rs.getString("job"));
				list.add(uvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(conn, pstmt, rs);
		}
		return list;
	}
	
	@Override
	public EmpVO empSelect(int empno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmpVO evo = new EmpVO();
		try { 		
			DBConn db  = new DBConn();
			conn = db.conn();
			
			String sql = "select * from emp2 where empno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			rs = pstmt.executeQuery();
			rs.next();
			
			evo.setEmpno(rs.getInt("empno"));
			evo.setEname(rs.getString("ename"));
			evo.setJob(rs.getString("job"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return evo;
	}

	@Override
	public int empInsert(EmpVO evo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int res = 0;
		
		try { 		
			DBConn db  = new DBConn();
			conn = db.conn();
			
			String sql = "insert into emp2(empno, ename, sal) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, evo.getEmpno());
			pstmt.setString(2, evo.getEname());
			pstmt.setInt(3, evo.getSal());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int empUpdate(EmpVO evo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int res = 0;
		
		try { 		
			DBConn db  = new DBConn();
			conn = db.conn();
			
			String sql = "update emp2 set sal = sal+100 where empno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, evo.getEmpno());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int empDelete(int empno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int res = 0;
		
		try { 		
			DBConn db  = new DBConn();
			conn = db.conn();
			
			String sql = "delete from emp2 where empno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	

}

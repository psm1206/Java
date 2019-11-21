package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.EmpVO;

//JDBC : Java DataBase Connectivity 
//:: DRIVER 설치 : ojdbc.jar 파일 : JDK경로에 두는것
//MS-SQL
//MySQL Maria    Oracle
public class JDBCVOTest {
							
	public static void main(String[] args) {
		EmpImpl t = new EmpImpl();
		//-----------------------------------
		//ArrayList<EmpVO> empSelect();
		//-----------------------------------
		ArrayList<EmpVO> list = t.empSelect();
//		for(int i=0; i<list.size(); i++) {
//			int aa = list.get(i).getEmpno();
//			String bb = list.get(i).getEname();
//			System.out.println(aa + ","  +bb);			
//		}

		
//		-----------------Generic 사용안할 경우---------------------
//		boolean success = new EmpSaveFile().saveFile(list);
//		if(success)
//			System.out.println("직렬화 :: 파일저장 ok");
//		else 
//			System.out.println("직렬화 :: 파일저장 faild");
//		
//		new EmpSaveFile().loadFile("C:\\Users\\Public\\Downloads\\emp_list.data");

	
	
//		-----------------Generic 사용 ---------------------
		boolean success = new EmpSaveFile<ArrayList<EmpVO>>().saveFile(list);
		if(success)
			System.out.println("직렬화 :: 파일저장 ok");
		else 
			System.out.println("직렬화 :: 파일저장 faild");
		
		new EmpSaveFile<ArrayList<EmpVO>>().loadFile("C:\\Users\\Public\\Downloads\\emp_list.data");
		
		
		//-----------------------------------
		//EmpVO empSelect(int empno); 
		//-----------------------------------
		EmpVO evo = t.empSelect(7934);
		System.out.println(evo.getEname());
		
//		-----------------Generic 사용 ---------------------		
		boolean success2 = new EmpSaveFile<EmpVO>().saveFile(evo);
		if(success2)
			System.out.println("직렬화22 :: 파일저장 ok");
		else 
			System.out.println("직렬화22 :: 파일저장 faild");
		
		new EmpSaveFile<EmpVO>().loadFile("C:\\Users\\Public\\Downloads\\emp_list.data");
		

		
		//-----------------------------------
		//int	empInsert(EmpVO uvo); //empno, ename
		//-----------------------------------
		EmpVO datavo = new EmpVO();
		datavo.setEmpno(9999);
		datavo.setEname("VOTESTER");
		datavo.setSal(1000);
		
		int ires = t.empInsert(datavo);
		System.out.println(ires + "건 입력");
		
		//-----------------------------------
		//int	empUpdate(EmpVO uvo); //sal+100 empno=
		//-----------------------------------
		int	ures = t.empUpdate(datavo);  //9999
		System.out.println(ures + "건 수정");
		
		
		//-----------------------------------
		//int	empDelete(int empno);	
		//-----------------------------------
		int	dres = t.empDelete(9999);  //9999
		System.out.println(dres + "건 삭제");
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}

package db;

import java.util.ArrayList;

import db.EmpVO;

public interface Emp {
	//public abstract 
	ArrayList<EmpVO> empSelect();
	EmpVO empSelect(int empno);
	int	empInsert(EmpVO uvo); //empno, ename
	int	empUpdate(EmpVO uvo); //sal+100 empno=
	int	empDelete(int empno);	
	
}

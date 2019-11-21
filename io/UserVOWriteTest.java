package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserVOWriteTest {

	public static void main(String[] args) {
		UserVO kimVO = new UserVO();
		UserVO leeVO = new UserVO();
		kimVO.setEmpno(9988);
		kimVO.setEname("김길동");
		
		leeVO.setEmpno(8877);
		leeVO.setEname("이름이");
		//----------------------------------------
		
//		String aa = kim.getEname();
//		String bb = lee.getEname();
//		System.out.println(aa + "," + bb);
		String str = leeVO.toString();
		System.out.println(str);
		
		leeVO.toPrint();
		
		//generic type -------------
		ArrayList<UserVO> list = new ArrayList<UserVO>();
		list.add(leeVO);
		list.add(kimVO);
		//list.add("이건테스트");
		
		UserVO rvo = list.get(1);
		System.out.println("1번째:" + rvo.getEname());
		
		try {
			FileOutputStream fos
			   = new FileOutputStream("C:\\Users\\Public\\Downloads\\user_vo.txt");
			
			ObjectOutputStream oos 
				= new ObjectOutputStream(fos);
			oos.writeObject(list);  //직렬화
			
			oos.close();
			
			//-------------------파일생성확인--------------
			FileInputStream fis = new FileInputStream("C:\\Users\\Public\\Downloads\\user_vo.txt");
			ObjectInputStream ois 
				= new ObjectInputStream(fis);
			
			ArrayList<UserVO> rlist = (ArrayList<UserVO>)ois.readObject(); //역직렬화
			
			for(int i=0; i<rlist.size(); i++) {
				//System.out.println(rlist.get(i).getEname() + "\t" + rlist.get(i).getEmpno());
				rlist.get(i).toPrint();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		////finally close()...64 line
		
	}

	
}

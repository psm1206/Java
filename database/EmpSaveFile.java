package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmpSaveFile<T> {
	
	
    
	public boolean saveFile(T type) {
		boolean success = false;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\Public\\Downloads\\emp_list.data");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(type);  //직렬화
			oos.close();
			success = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return success;
	}
	
	//ArrayList...
	public void loadFile(String filePath) {
		try {
			//-------------------파일생성확인--------------
			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			System.out.println("역질렬화 파일 출력");
			
			T datas = (T)ois.readObject(); //역직렬화
			System.out.println(datas);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}



//public class EmpSaveFile {
//	public boolean saveFile(Object o) {
//		boolean success = false;
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
//		
//		try {
//			fos = new FileOutputStream("C:\\Users\\Public\\Downloads\\emp_list.data");
//			oos = new ObjectOutputStream(fos);
//			oos.writeObject(o);  //직렬화
//			oos.close();
//			success = true;
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return success;
//	}

//	ArrayList...
//	public void loadFile(String filePath) {
//		try {
//			//-------------------파일생성확인--------------
//			FileInputStream fis = new FileInputStream(filePath);
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			
//			System.out.println("역질렬화 파일 출력");
//			ArrayList<EmpVO> rlist = (ArrayList<EmpVO>)ois.readObject(); //역직렬화
//			for(int i=0; i<rlist.size(); i++) {
//				//System.out.println(rlist.get(i).getEname() + "\t" + rlist.get(i).getEmpno());
//				rlist.get(i).toPrint();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} 
//	}
//}

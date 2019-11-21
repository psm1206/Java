package io;

import java.io.File;
import java.util.ArrayList;

public class FileDirTest {
	final static String PATH = "C:\\Users\\A-28\\Desktop";

	public static void main(String[] args) {
		new FileDirTest().getListforDir(PATH);
	}
	
	public void getListforDir(String dirPath) {
		//f는 해당 경로로 가서 파일을 다루는 Handler (Java가 Windows에 바로 접근할 수는 없으니..)
		File f = new File(dirPath);  // 설치파일을 다룰 수 있는 Handler
		if (!f.isDirectory() || !f.exists()) {
			System.out.println("DirectoryNotFound");
			System.exit(0);
		}
		System.out.println(f);
		
		File[] flist = f.listFiles(); // 해당 경로의 모든 Handler를 배열에 저장.
		System.out.println(flist);
		ArrayList dlist = new ArrayList();
		
		for (int i=0; i<flist.length; i++) {
			if(flist[i].isDirectory()) {
				// File.getName은 해당 폴더나 파일의 이름을 가져옴.
				System.out.println(flist[i].getName()); 
				dlist.add(flist[i].getPath());
			} 
		}
		for(int i=0; i<dlist.size(); i++) {
			String path = (String)dlist.get(i);
			getListforDir(path);
		}
	}
}

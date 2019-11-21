package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCopyFolder {

	public static void main(String[] args) {
		File fi = new File("C:\\Users\\Public\\Documents\\test1");
		File fo = new File("C:\\Users\\Public\\Documents\\test2");
		copy(fi, fo);
	}
	
	public static void copy(File cop, File pas) {
		File[] flist = cop.listFiles(); 
		for (int i=0; i<flist.length; i++) {
			File temp = new File(pas.getAbsolutePath()  + "\\" + flist[i].getName());
			
			if (flist[i].isDirectory()) {
				temp.mkdir(); ////
				copy(flist[i], temp);
			} else {
				FileInputStream fr = null;
				FileOutputStream fw = null;
				try {
					fr = new FileInputStream(flist[i]);
					fw = new FileOutputStream(temp);		
					int b = 0;
					while( (b = fr.read()) != -1) {
						fw.write(b); ////
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (fr !=null) fr.close() ;
						if (fw !=null) fw.close() ; 			
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		System.out.println("----file copy done----");
	}
}



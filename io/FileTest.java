package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

	final static String PATH = "C:\\Users\\Public\\Downloads\\"; // kosa 폴더에 대한 read, write 권한이 있어야 접근 가능

	public static void main(String[] args) {
		//		String ifname = "in.txt";
		//		String ofname = "out.txt";
		String[] fname = {"BTS.jpg", "out1.jpg"};

		FileInputStream fis = null;
		FileOutputStream fos = null;
		FileOutputStream fos2 = null;

		File inFile= new File(PATH, fname[0]);
		File outFile = new File(PATH, fname[1]);

		//------------- out.txt ------------
		if (outFile.exists()) {
			System.out.println("AlreadyExist" + fname[1]);
			outFile.delete();
			System.out.println("FileDelete:" + fname[1]);
		}
		
		//------------- in.txt -------------
		if (!inFile.exists() || !inFile.canRead()) { // 파일이 없거나, 있는데 Read할 수 없거나

			System.out.println("FileNotFound:" + fname[1]);
			//			System.exit(0);
			try {
				//boolean createSuccess = inFile.createNewFile();
				fos2 = new FileOutputStream(inFile);

				if(inFile.length() <=0) {
					byte[] sample = {65,66,67,68,69};
					fos2.write(sample);
				}
				fis = new FileInputStream(inFile);
				fos = new FileOutputStream(outFile);
				int b = 0;
				while( (b = fis.read()) != -1) {
					//System.out.println(b + ", " + (char) b);
					fos.write(b);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
//				try {
//					if (fis !=null) fis.close() ;
//					if (fos !=null) fos.close() ;
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
			}
		} else {
			try {
				fis = new FileInputStream(inFile);
				fos = new FileOutputStream(outFile);
				int b = 0;
				while( (b = fis.read()) != -1) {
					//System.out.println(b + ", " + (char) b);
					fos.write(b);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
//				try {
//					if (fis !=null) fis.close() ;
//					if (fos !=null) fos.close() ;
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
			}
		}
		System.out.println("----file copy done----");
	}
}



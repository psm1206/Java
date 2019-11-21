package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOFileReader {

	public static void main(String[] args) {
		File fi = new File("C:\\Users\\Public\\Downloads\\BTS.jpg");
		File fo = new File("C:\\Users\\Public\\Downloads\\out.jpg");
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader(fi);
			fw = new FileWriter(fo);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String b = "";
			while( (b = br.readLine()) != null) {
				bw.write(b);
			}
			bw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 보조 스트림을 닫으면 기반 스트림도 닫힌다고 나와있지만, 기반 스트림 주소가 살아있음. 그러니까 둘 다 닫아주자.
//				if (bais !=null) bais.close() ;
//				if (baos !=null) baos.close() ; 
				if (fr !=null) fr.close() ;
				if (fw !=null) fw.close() ; 
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("----file copy done----");
	}

}

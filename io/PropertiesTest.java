package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			//String path = "C:\\kosa\\workspace_java\\java_prj\\src\\oracle.properties"; //properties 파일들은 resource 폴더에 넣음.
			String path = "C:\\kosa\\workspace_java\\java_prj\\src\\oracle.xml";
			
			FileOutputStream fos = null; 
			prop.setProperty("ORACLE_URL", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
			prop.setProperty("ORACLE_USER", "kosa");
			prop.setProperty("ORACLE_PASSWORD", "0000");
			
			fos = new FileOutputStream(path);
			prop.storeToXML(fos, "My First Properties Test");
			fos.close();
			
//			FileInputStream fis = new FileInputStream(path);
//			prop.load(fis);
//			String URL = (String) prop.get("ORACLE_URL");
//			String USER = (String) prop.get("ORACLE_USER");
//			String PASSWORD = (String) prop.get("ORACLE_PASSWORD");
//			System.out.println(URL + ", " + USER + ", " + PASSWORD);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("====done====");
	}

}

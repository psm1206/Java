package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Arrays;

public class IOByteArray2 {

	public static void main(String[] args) {
				//byte[] buf = new byte[5];
				char[] buf = {'a','b','c','d'};
				CharArrayReader car = new CharArrayReader(buf);
				CharArrayWriter caw = new CharArrayWriter();
				// 한 바이트씩 갖고 오면 너무 오래 걸리니 한 번에 buffer로!
				BufferedReader br = new BufferedReader(car);
				BufferedWriter bw = new BufferedWriter(caw);
		try {
				System.out.println("---input---");
				String b = "";
				// buffer를 사용한만큼 한 번에 읽기 위해 readLine을 사용함.
				while ((b = br.readLine()) != null) {
					System.out.println(b);
					bw.write(b);
				}
				bw.flush(); 

//				System.out.println("---output---");
//				// out에 써진 걸 확인함.
//				byte[] obuf = baos.toByteArray();
//				for (int i=0; i<obuf.length; i++) {
//					System.out.println(obuf[i]);
//				}
//				
//				String str = Arrays.toString(obuf); // Arrays는 모든 메서드가 static이라 인스턴스화 해줄 필요없음.
//				System.out.println(str);
				System.out.println("---program done---");
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 보조 스트림을 닫으면 기반 스트림도 닫힌다고 나와있지만, 기반 스트림 주소가 살아있음. 그러니까 둘 다 닫아주자.
//				if (bais !=null) bais.close() ;
//				if (baos !=null) baos.close() ; 
				if (br !=null) car.close() ;
				if (bw !=null) caw.close() ; 
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

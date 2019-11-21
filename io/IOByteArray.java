package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOByteArray {

	public static void main(String[] args) {
				//byte[] buf = new byte[5];
				byte[] buf = {1, 2, 3, 4};
				ByteArrayInputStream bais = new ByteArrayInputStream(buf);
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				// 한 바이트씩 갖고 오면 너무 오래 걸리니 한 번에 buffer로!
				BufferedInputStream bis = new BufferedInputStream(bais);  
				BufferedOutputStream bos = new BufferedOutputStream(baos);
				
		//		while (true) {
		//			int b = bais.read();
		//			if (b == -1) break;
		//		}
		//		int b = 0;
		//		while ((b = bais.read()) != -1) {
		//			System.out.println(b);
		//		}
				// 2, 4 출력 // .read()할 때마다 바로 변수에 담아두지 않으면 다음 바이트로 건너감.
		//		while (bais.read() != -1) {
		//			System.out.println(bais.read());
		//		}
				// .read()한 것을 다 같이 쓰기 위해 전역변수에 보통 저장함.
				
				// 읽은 걸 out에 씀.
				
		try {
				System.out.println("---input---");
				int b = 0;
				while ((b = bais.read()) != -1) {
					System.out.println(b);
					baos.write(b);
				}
				bos.flush(); 

				System.out.println("---output---");
				// out에 써진 걸 확인함.
				byte[] obuf = baos.toByteArray();
				for (int i=0; i<obuf.length; i++) {
					System.out.println(obuf[i]);
				}
				
				String str = Arrays.toString(obuf); // Arrays는 모든 메서드가 static이라 인스턴스화 해줄 필요없음.
				System.out.println(str);
				System.out.println("---program done---");
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 보조 스트림을 닫으면 기반 스트림도 닫힌다고 나와있지만, 기반 스트림 주소가 살아있음. 그러니까 둘 다 닫아주자.
//				if (bais !=null) bais.close() ;
//				if (baos !=null) baos.close() ; 
				if (bis !=null) bais.close() ;
				if (bos !=null) baos.close() ; 
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

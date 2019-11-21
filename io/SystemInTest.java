package io;

import java.util.Scanner;

public class SystemInTest {

	public static void main(String[] args) {
		// o = PrintStream(s.getOutputStream());
		// o.println("dddd");
		System.out.println("dddd");
		System.err.println("error");
		//static은 class와 같이 살고 같이 죽음. 
		//그냥 쓰면 어디 것인지 모르니까 System꺼야~ 라고 표시할 용도로 System.out.println()
		//Field도 변수
		//InputStream,,
//		System.in
//		System.in.read();
		System.out.println("이름은?: ");
		Scanner s = new Scanner(System.in); // 콘솔에서 입력 받겠다. 개행 라인을 만나기 전까지 다 불러옴.
		//int i = s.nextInt();
		
		String msg = s.nextLine();
		System.out.println("사용자 입력값:" + msg);
		
		
		
	}
}

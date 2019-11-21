package pkg;

import java.io.IOException;

interface Myinter {
	void add();
	void div();
}

interface OtherInter extends Myinter {
	
}

public class Throw01 {
	public static void main(String[] args) {
		try {
			method1();
			System.out.println(6);
		} catch(Exception e) {
			System.out.println(7);
		}
	}
	static void method1() throws IOException {
		int a = 3;
		System.out.println(a);
		try {
			method2();
			System.out.println(1);
		} catch(IOException e) {
			System.out.println(2);
			throw e;
		} catch(Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
	}
	static void method2() throws IOException{
		method3();
	}
	static void method3() throws IOException{
		throw new IOException();
	}
}
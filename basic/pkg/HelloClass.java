package pkg;
//자바는 무조건 class가 감싸줘야 함.
//public 들어간 클래스는 무조건 하나만 있어야 함.
//public class 이름은 자바 파일명만 가능

public class HelloClass {
	public static void main(String[] args) {
		System.out.println("Hello");
	
	}
	public int myprint() {
	
	//public void myprint() {
		//return 5; return이 필요없음.
	int a = 6;
	short b = 5;
	byte c = 3;
	float fnum = 0.1f;
	float fnum2 = (float)0.5;
	float fnum3 = 0.5f;
	double dnum = 0.5;
	
	int ii = 65;
	char cc = (char)ii; //A
	char cc2 = (char)(ii + 1);  //B
	
	System.out.println(cc); //아스키코드가 나옴.
	
	String str = "a";
	char str1 = 'a';
	String res1 = 'a' + "b"; //"ab" 업캐스팅 자료형의 크기가 더 큰 자료형에 담아짐.
	boolean check = true;
	String res4 = check + "B";
	// int에 뭘 갖다 붙여도 숫자, String에 뭘 갖다 붙여도 문자 sql의 null같은 존재
	
	String alpa = "A";
	//char ccc = (char) alpa; // 기본타입과 참조타입은 서로 캐스팅 불가.
	
	return 5;
	}

}

//
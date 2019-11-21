package pkg;
//변수 : 타입에 따른 분류(기본/참조)
//변수 : 위치에 따른 분류(전역/지역)
//전역변수 : Class 전 영역에서 누구든지 쓸 수 있는 것
//변수 : static 키워드 유무
public class VariableClass01 {
	int bonus = 1000;
	static double rate = 10.0;
	public static void main(String[] args) {
		int local_point = 100;
		System.out.println(rate);
//		System.out.println(bonus); //static 변수는 static 함수에만 들어갈 수 있음.
		VariableClass01 vc = new VariableClass01(); //static을 제외한 나머지 것들 다 메모리에 올림. 파이썬의 생성자와 같은 개념.
		vc.call1();
		call3();
		vc.call3();
		VariableClass01.call3(); // 클래스와 같이 살고 같이 죽음.
	}
	public void call1() {
		bonus = bonus + 1;
		bonus += 1;
		bonus++; //++bonus;
	}
	public void call2() {
		byte b = 10;
		char c;
		c = (char) b;
		
		
	}
	public static void call3() {
		
	}
}
//메모리에 올라가면 인스턴스화 되었다고 함.
//static이라고 하면 일단 메모리에 올리고 봄.

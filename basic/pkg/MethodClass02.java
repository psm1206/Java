package pkg;

public class MethodClass02 {
	int iv = 0;
	static int cv = 0;
	int a;
	String str;
	
	public void instanceAdd() {

		System.out.println(a);
		System.out.println(iv + 1 + str); //1null 앞에서부터 순서대로 더하면서 진행. (0+1) + null -> 1null
		
		System.out.println("instanceAdd() 콜");
		
		MethodClass02 mc = new MethodClass02();
		int bonus = 2000;
		System.out.println(mc.bonus + "--------" + bonus);
		System.out.println(mc + "," + this); // 해당클래스의 인스턴스 주소, new가 내장되어 있음.
	}
	public static void classAdd() {
		System.out.println("classAdd() 콜");
	}
	
	public void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
		instanceAdd();
		classAdd();
	}

	public static void classMethod() {
		MethodClass02 mc = new MethodClass02();
		//System.out.println(iv); //error
		System.out.println(mc.iv);
		System.out.println(cv);
		System.out.println(MethodClass02.cv);
		System.out.println(mc.cv); // static이라 이미 메모리에 올라가 있는데 굳이?
		//instanceAdd(); //error
		mc.instanceAdd(); //참조변수로 접근
		classAdd();

	}
	
	int bonus = 1000;
	public static void main(String[] aaa) {	
		MethodClass02 mc = new MethodClass02();
		int bonus = 2000;
		System.out.println(mc.bonus + "--------" + bonus);
		System.out.println(mc); // 주소를 찍어냄
		mc.instanceAdd();

	}
}

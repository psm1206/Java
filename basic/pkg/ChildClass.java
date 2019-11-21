//package pkg;
//// 같은 패키지는 import 불필요.
//// import 풀패키지..클래스이름까지.
//// package는 코드의 첫 줄에 적어야 함.
//// 패키지를 안 쓰는 클래스는 불러들일 수 없음(import 불가).
//// 이름은 같게, 괄호 안은 다르게 -> 오버로딩!
//
//public class ChildClass extends ParentClass {
//	int bonus = 1000;
//	
//	public ChildClass() {
////		super("");
//		//직접 super를 적는 것이 아니면 항상 숨어있음.
//		
//		new ParentClass("-kim");
//		System.out.println("C생성자콜");
//		
//		int bonus = 10;
//		System.out.println(bonus);
//		System.out.println(this.bonus);
//		System.out.println(super.bonus);
//		System.out.println(this);
//		System.out.println(this);
//		
//		
//	}
//	
//	//오버라이딩(overriding): 부모 메서드의 내용 변경
//	// 부모 메서드에서 메서드 선언부 그대로 끌고 와서 내용 변경!
//	public int div(int a, int b) {
//		System.out.println("1 2 3 4 div()콜");
//		return a / b;
//	}
//	public long div(long a, int b) {
//		System.out.println("1 2 3 4 div()콜");
//		return a / b;
//	}
//
//	
//	public static void main(String[] args) {
//		ChildClass kim = new ChildClass();
//		kim.bonus = 500;
//		
//		int res = kim.div(6, 2); //div가 static 메서드가 아니지만, 
//								//이미 위에서 super();가 실행되었기 때문에 생성자가 생겼음!
//		System.out.println(res);
//		System.out.println(kim);		
//	}
//
//}

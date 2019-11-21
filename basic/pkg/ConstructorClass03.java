package pkg;


public class ConstructorClass03 {
	String compName = "KOSA";
	//생성자(Constructor): 접근자 클래스명(접근자 생략가능)
	//초기화: 신규 메모리, 각자 사용할 값 초기화(생성자가 input을 받는 이유이기도 함.)
	public ConstructorClass03() {		//파라미터가 있는 생성자
		this(9, "Lee"); //this는 가장 위에 적어둬야 함. 또한 생성자메서드 안에서만 쓸 수 있음.
		new ConstructorClass03(9, "Lee");
		String compName = "GOSA";
		// this = new ConstructorClass03()
		System.out.println(this.compName + compName);
		System.out.println(new ConstructorClass03(10, "").compName);
		//위 두개는 같은 의미
		System.out.println("기본생성자");
	}
	public ConstructorClass03(int age, String name) {
		
	}
	//메서드: 접근자 return형태 메서드명
	public void ConstructorClass() {
		System.out.println("...");
	}
	
	static int static_bonus = 100;
	int bonus = 1000;
	//------------------
	public static void main(int args) {
	System.out.println("main trick...");
	}
	
	public static void main(String[] args) {
//		a = new ConstructorClass03(3); // new 연산자는 생성자를 생성하라는 의미
//		this = this();
		//위 두개는 같은 의미
		ConstructorClass03 c1 = new ConstructorClass03(5, "Kim");
		ConstructorClass03 c2 = new ConstructorClass03(7, "Park");
		static_bonus = 500;
		System.out.println(c2.static_bonus); //500 static은 그 누구의 소유도 아니다 공유하는 것.
		
		c1.bonus = 333;
		System.out.println(c1.bonus); //333
		System.out.println(c2.bonus); //1000
		
		
		
	}
}

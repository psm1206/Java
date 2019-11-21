package pkg;

public class ThisClass04 {
	int bonus = 1000;
	ThisClass04() {
		System.out.println("기본생성자 콜");
	}
	public static void main(String[] args) {
		ThisClass04 kim = new ThisClass04();
		kim.bonus = 2000;
		
		ThisClass04 lee = new ThisClass04();
		lee.bonus = 500;
		System.out.println(lee.bonus);
	}
}

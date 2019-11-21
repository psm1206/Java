package pkg;
public class InterFace {
	public static void main(String[] args) {
		Inf a;
		a = new Ch_Cls();
		a.print();
	}
}

interface Inf{
	public static final String str = "abc";
	public abstract void print();
}

class Pa_Cls {
	public String str = "ㄱㄴㄷ";
	public void print() {
		System.out.println(str);
	}
}

class Ch_Cls extends Pa_Cls implements Inf {
	public void print() {
		System.out.println(super.str);
	}
}


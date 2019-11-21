package pkg;

public class ifClass06 {

	public static void main(String[] args) {
		int score = 85;
		String gen = "f";
		if (score > 90) {
			System.out.println("A");
			System.out.println("AA");
			if (gen.equals("m")) {
				System.out.println("+2");
			}
			else {
				System.out.println("+0");
			}
		}
		else if(score > 80 && gen.equals("m"))
			System.out.println("B");
		else if(score > 80 && gen.equals("f"))
			System.out.println("B-1");
		else 
			System.out.println("C");
		//-----switch
//		String grade = "D";
		int kor = 92;
		switch (kor) {
			case 90:
				System.out.println("A");
				break;
			case 91:
				System.out.println("B");
				break;
			default:		//case에 있는 조건들과 모두 부합하지 않다면, default 실행.
				System.out.println("C");
				break;
		}
		System.out.println("switch done..");
		int treeHit = 0;
		while (treeHit < 10) {
		    treeHit++;
		    System.out.println("나무를  " + treeHit + "번 찍었습니다.");
		    if (treeHit == 10) {
		        System.out.println("나무 넘어갑니다.");
		    }
		}
		
	}

}
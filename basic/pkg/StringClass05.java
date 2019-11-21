package pkg;

public class StringClass05 {

	public static void main(String[] args) {
//		String str = "ABC";
//		String str2 = "ABC"; //같다
		String str = new String("ABC");
		String str2 = new String("ABC"); //다르다
		
		if (str == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		if (str.equals(str2)) {
			System.out.println("같다"); //출력
		} else {
			System.out.println("다르다");
		}
	}

}

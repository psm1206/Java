package pkg;

public class ArrayClass08 {
	//전역변수에 초기화 안 시킨 배열변수를 선언하면 안에 null
	static int[] ar;
	//int[] (int형 배열변수) 은 레퍼런스 타입임.
	//타입[] 변수명, 타입 변수명[]
	//위 두 가지 경우로 배열변수를 선언할 수 있지만, 전자를 더 많이 씀. 변수명이 길어지면 배열임을 알기 어렵기 때문.
	public static void main(String[] args) {
		//배열 : 연속된 값
		//배열변수 : 여러 값을 한번에 담을 수 있는 변수
//		int a;
//		int[] arr;
//		arr = null;
//		int[] arr = null;
		int[] arr1 = new int[] {1, 2, 3, 4};
		int[] arr2 = {1, 2, 3, 4, 5};
		// 위아래가 같은 문법
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr2.length);
//		for (int i=0; i<arr2.length; i++) {
//			System.out.println(arr2[i] + " ");
//		}
//		for (int i : arr2) {
//			System.out.println(i + " ");
//		}
		
		int[] arr = new int[4];
		
//		String[] strarr = new String[4];
		String[] strarr = {"AB", "CD", "EF"};
		String aa = "ABC";
		String bb = new String("ABC");
		
		for (String str : strarr) {
			System.out.println(str);
		}
		for(int i =0; i<strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		
//		boolean[] bools = new boolean[3];
//		boolean[] bools2 = {true, false, true};
//		int[][] numarr = new int[2][3];
		int[][] numarr = new int[][] { {1,2,3}, {4,5,6} };
		System.out.println(numarr[0][1]);
		System.out.println(numarr.length);
		for (int r=0; r<numarr.length; r++) {
//			System.out.println(numarr[r]);
			for (int c=0; c<numarr[0].length; c++) {
				System.out.print(numarr[r][c]);
			}
			System.out.println();
		}
		
//		String[][][] orderarr = new String[2][3][4];
		String[][][] samcha = { 
								{ {"A1","B1"}, {"C1","D1"}},
								{ {"A2","B2"}, {"C2","D2"}}, 
								{ {"A3","B3"}, {"C3","D3"}}
							  };
		System.out.println(samcha[1][0][1]);
		
		System.out.println("done===="+ar); //변수를 초기화 안하고 선언만 하는 건 가능. 하지만 해당 변수를 사용하면 error
		
		String cats[] = {"F", "Spot"};
		
		
	}

}

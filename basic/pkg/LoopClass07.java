package pkg;

public class LoopClass07 {

	public static void main(String[] args) {
//		for a in range(1, 11):
		for (int a=1; a<=10; a++) {
			System.out.println(a);
		}
		for (int a=1, b=2; a<=5 && b<5; a++, b++) {
			System.out.println(a + "------");
		}
		int[] dan_list = {2,3,4,5,6,7,8,9};
		int[] gob_list = {1,2,3,4,5,6,7,8,9};
		
		for (int dan : dan_list) {
			System.out.printf("\n[%d단]\n", dan);
			for (int gob : gob_list) {
				System.out.printf("%dX%d=%02d\t", dan, gob, dan*gob);
			}			
		}
		
		for (int dan=2; dan<10; dan++) {
			System.out.printf("\n[%d단]\n", dan);
			for (int gob=1; gob<10; gob++) {
//				System.out.print(a + "X" + b + "=" + a*b + " ");
				System.out.format("%dX%d=%02d\t", dan, gob, dan*gob);			
			}
		}
		int cnt = 0;
		while(true) {
			if (cnt > 3) break;
			System.out.printf("\nwhile %d", cnt);
			cnt++;
		}
		cnt = 0;
		while(cnt<=3) {
			System.out.printf("\nwhile %d", cnt);
			cnt++;
		}
		cnt = 1;
		System.out.println("");
		do {
			System.out.println("do-while" + cnt);
			cnt++;
		} while(cnt<=3);
//		int i =1;
//		for (;i<=(5%10);i++) {
//			System.out.println(i);
//		}
//		do {
//			a + b;
//		} while(조건);
		int i=1;
		int j=10;
		do {
			if(i++> j--) {
				continue;
			}
		} while (i <5);
		System.out.println(i + j);


	}

	
}

package ex1_array;

public class Ex2_Array {
	public static void main(String[] args) {
		
		char[] ch;
		ch = new char[4];
		// char[] ch = new char[4]; 선언 + 생성
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
//		for (int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i]);
//		}

		// 개선된 배열형 for-loop
		for (char ch2: ch) {
			System.out.print(ch2);
		}
		
	}
}

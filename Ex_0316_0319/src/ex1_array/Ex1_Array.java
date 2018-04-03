package ex1_array;

public class Ex1_Array {
	public static void main(String[] args) {
		
		// 배열 선언 (stack)
		int[] su;
		
		// 배열 생성 (heap)
		su = new int[10];
		
		// 배열 초기화
		su[0] = 100;
		su[1] = 200;
		su[2] = 300;
		su[3] = 400;
		
		// su[4] = 500; -> Exception: 존재하지 않는 index 로의 접근
		
		// 배열의 모든 내용을 화면에 for-loop을 이용해 출력
		for (int i = 0; i < su.length; i++) {
			su[i] = (i + 1) * 100;
			System.out.println(su[i]);
		}
		
	}
}

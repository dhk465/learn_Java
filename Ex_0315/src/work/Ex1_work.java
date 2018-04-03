package work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		// 스캐너를 통해 정수 n에 값을 입력
		// 1부터 n까지의 합을 계산하여 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int n = sc.nextInt();
		int result = 0;
		
		for (int i = n; i > 0; i--) {
			result += i;
		} 
		
		System.out.printf("1부터 %d까지의 합계: %d", n, result);
		
	}
}

package work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		// 키보드에서 정수 n1, n2에 갑을 받는다
		// n1부터 n2까지의 합을 계산하여 결과를 출력
		// n1과 n2 중 작은 수에서 시작하여 큰 수까지 합을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력: ");
		int n1 = sc.nextInt();
		System.out.print("두번째 정수를 입력: ");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}
		
		int sum = 0;
		
		for (int i = n1; i < n2 + 1; i++) {
			sum += i;
		}
		
		System.out.printf("%d부터 %d까지의 합: %d\n", n1, n2, sum);
		
	}
}

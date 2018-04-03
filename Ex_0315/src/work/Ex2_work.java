package work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("정수를 입력하세요: ");
			int num = sc.nextInt();
			int i;
			for (i = 2; i < num + 1; i++) {
				if (num % i == 0) {
						break;
				}
			}
			
			if (i == num && num > 0) {
				System.out.printf("%d은 소수입니다.\n", num);
			} else {
				System.out.printf("%d은 소수가 아닙니다.\n", num);
			}
		}
		
		
	}
}

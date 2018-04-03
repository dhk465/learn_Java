package work;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		int num_1 = 1;
		int num_2 = 0;
		int num_3 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("최대값이 될 정수를 입력하세요: ");
		int max = sc.nextInt();
		
		for (int i = 0; i < max; i++) {
			num_2 = num_3;
			num_3 = num_1;
			num_1 = num_2 + num_3;
			System.out.printf("%d ", num_3);
		} 
/*		a = b + c
		2 = 1 + 1
		c = a + b 
		3 = 2 + 1 */
	}
}

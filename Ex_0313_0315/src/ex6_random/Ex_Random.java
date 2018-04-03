package ex6_random;

import java.util.Random;

public class Ex_Random {
	public static void main(String[] args) {
		//					.nextInt(난수범위) + 시작수;
		// 					.nextInt(큰 수 - 작은수 + 1) + 시작수)
		int num = new Random().nextInt(5) + 1;
		
		System.out.println(num);
		
		// 3 - 10 사이의 난수
		num = new Random().nextInt(10 - 3 + 1) + 3;
		
		System.out.println(num);
		
		System.out.println("--------------");
		
		// 2 - 9 사이의 난수를 발생시켜서 구구단 출력
		
		num = new Random().nextInt(9 - 3 + 1) + 2;
		
		System.out.println(num + "단");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %02d\n", num, i, (num * i));
		} // 구구단
		
		System.out.println("--------------");
		
		int ch = new Random().nextInt(90 - 65 + 1) + 65;
		// 혹은 char ch = (char)(Random().nextInt(90 - 65 + 1) + 65);
		// ('Z' - 'A' + 1) + 'A' 또한 가능
		System.out.println((char)ch);
		
	} // main
} // class

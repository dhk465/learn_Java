package ex3_scanner;

import java.util.Scanner;

public class Ex1_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int num = sc.nextInt(); // 키보드에서 정수값을 받는다.
		System.out.println("입력받은 수: " + num);
		
		System.out.println("문장을 입력하세요: ");
		String str = sc.next(); // 키보드로 문자열 값을 받는다. 띄어쓰기 이전의 문자열만 입력받음**
		System.out.println("입력받은 값: " + str);
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("문장을 입력하세요: ");
		str = sc2.nextLine(); // 문자열을 띄어쓰기를 포함해서 입력받는다.
		System.out.println("입력받은 문장: " + str);
		
	}
	
}

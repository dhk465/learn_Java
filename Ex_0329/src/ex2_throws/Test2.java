package ex2_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {

	public void getRes() throws InputMismatchException { // 어딘가에 있는 catch안에서 처리하는것을 예상하고 쓰로우를 사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num;

		num = sc.nextInt();
		System.out.println("결과: " + num);
			
		System.out.println("정수만 입력하세요.");

		
		
	} // getRes()
	
}

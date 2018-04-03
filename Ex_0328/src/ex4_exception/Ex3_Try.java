package ex4_exception;

import java.util.Scanner;

public class Ex3_Try {
	public static void main(String[] args) {
		
		//키보드에서 정수를 입력받도록 하고, 정수를 입력 받았을 경우 그 수를 그대로 출력.
		//정수 이외의 값을 받았을 경우 "정수만 입력 가능"이라는 메시지 출력
		//------------------------
		//정수 : 5
		//입력받은 수 : 5
		
		//정수 : *
		//정수만 입력할 수 있습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		
		try {
			int n = sc.nextInt();
			System.out.println("입력받은 수 : " + n);
			
		}catch(Exception e) {
			
			System.out.println("정수만 입력할 수 있습니다.");
			
		}
		
	}//main
}


































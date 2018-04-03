package ex4_thread;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		
		// 정수를 입력받고
		// 입력받은 숫자를 1씩 감소
		// 0이 되면 종료메시지 출력
		// 단, 값을 받는 코드는 main에서
		// 1씩 감소시키는 코드는 ThreadCount에서
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
				
		ThreadCount tc = new ThreadCount(num);
		Thread th = new Thread(tc);
		
		th.start();
		
	}
}

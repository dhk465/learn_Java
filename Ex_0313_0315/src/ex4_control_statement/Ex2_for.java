package ex4_control_statement;

import java.util.Scanner;

public class Ex2_for {

	public static void main(String[] args) {
		
		// 키보드로 2-9 사이의 정수를 입력받고
		// 입력받은 숫자에 해당되는 구구단을 출력
		
		for (;;) {
			Scanner sc = new Scanner(System.in);
			System.out.print("구구단 단수(정수)를 입력하세요. 종료하려면 0을 입력: ");
			int dan = sc.nextInt();
			
			if (dan > 1 && dan < 10) {
				System.out.println(dan + "단");
				for (int i = 1; i < 10; i++) {
					System.out.println(dan + " * " + i + " = " + (dan * i));
				}
			} else if (dan == 0) {
				break;
			} else {
				System.out.println("2에서 9까지의 정수만을 입력하세요.");
			}
		}
	}
}


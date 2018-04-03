package ex3_scanner;

import java.util.Scanner;

public class Ex2_Scanner {

	/*
	 수를 두개 입력 받고 연산기호를 입력받으면 그 연산 결과를 출력한다.
	 
	 	첫번째수 연산기호 두번째수 = 결과
	 */
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		String result = "";
		String str = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		num1 = sc.nextInt();
		System.out.print("두번째 수: ");
		num2 = sc.nextInt();
		
		System.out.print("연산기호: ");
		str = sc.next();
		switch (str) {
			case "+":
				result = num1 + " + " + num2 + " = " + (num1 + num2);
				break;
			case "-":
				result = num1 + " - " + num2 + " = " + (num1 - num2);
				break;
			case "*":
				result = num1 + " * " + num2 + " = " + (num1 * num2);
				break;
			case "/":
				result = num1 + " / " + num2 + " = " + (num1 / num2);
				break;
			case "%":
				result = num1 + " % " + num2 + " = " + (num1 % num2);
				break;	
			default:
				System.out.println("알 수 없는 연산기호 입니다.");
				break;
		}
		
		System.out.println("결과: " + result);
		
	}
	
}

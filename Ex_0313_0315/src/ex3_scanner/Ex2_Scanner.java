package ex3_scanner;

import java.util.Scanner;

public class Ex2_Scanner {

	/*
	 ���� �ΰ� �Է� �ް� �����ȣ�� �Է¹����� �� ���� ����� ����Ѵ�.
	 
	 	ù��°�� �����ȣ �ι�°�� = ���
	 */
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		String result = "";
		String str = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ��: ");
		num1 = sc.nextInt();
		System.out.print("�ι�° ��: ");
		num2 = sc.nextInt();
		
		System.out.print("�����ȣ: ");
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
				System.out.println("�� �� ���� �����ȣ �Դϴ�.");
				break;
		}
		
		System.out.println("���: " + result);
		
	}
	
}

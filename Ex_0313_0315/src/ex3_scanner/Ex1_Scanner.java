package ex3_scanner;

import java.util.Scanner;

public class Ex1_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���: ");
		int num = sc.nextInt(); // Ű���忡�� �������� �޴´�.
		System.out.println("�Է¹��� ��: " + num);
		
		System.out.println("������ �Է��ϼ���: ");
		String str = sc.next(); // Ű����� ���ڿ� ���� �޴´�. ���� ������ ���ڿ��� �Է¹���**
		System.out.println("�Է¹��� ��: " + str);
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���: ");
		str = sc2.nextLine(); // ���ڿ��� ���⸦ �����ؼ� �Է¹޴´�.
		System.out.println("�Է¹��� ����: " + str);
		
	}
	
}

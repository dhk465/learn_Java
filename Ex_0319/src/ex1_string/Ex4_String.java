package ex1_string;

import java.util.Scanner;

public class Ex4_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		String email;
		int indexAt;
		
		do {
			System.out.println("�̸����� �Է��ϼ���: ");
			email = sc.next();
			indexAt = email.indexOf("@");
			
			if (indexAt < 6 || indexAt > 10) {
				System.out.println("���̵�� 6������ 10���� ���ڸ��� �����ؾ��մϴ�.");
			}
		} while (indexAt < 6 || indexAt > 10);
		

//		id = email.substring(0, indexAt);
		
		String[] arr = email.split("@");
		id = arr[0];
		
//		if (arr[0].length() < 6 || arr[0].length() > 10) ...
		
		System.out.printf("%s�� ȯ���մϴ�.\n", id);
	}
}

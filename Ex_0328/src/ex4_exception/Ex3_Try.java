package ex4_exception;

import java.util.Scanner;

public class Ex3_Try {
	public static void main(String[] args) {
		
		//Ű���忡�� ������ �Է¹޵��� �ϰ�, ������ �Է� �޾��� ��� �� ���� �״�� ���.
		//���� �̿��� ���� �޾��� ��� "������ �Է� ����"�̶�� �޽��� ���
		//------------------------
		//���� : 5
		//�Է¹��� �� : 5
		
		//���� : *
		//������ �Է��� �� �ֽ��ϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		
		try {
			int n = sc.nextInt();
			System.out.println("�Է¹��� �� : " + n);
			
		}catch(Exception e) {
			
			System.out.println("������ �Է��� �� �ֽ��ϴ�.");
			
		}
		
	}//main
}


































package ex2_control_statement;

import java.util.Scanner;

public class Ex5_Switch {

	public static void main(String[] args) {
		
		// month ������ ���� �Է¹ް�
		// �Է¹��� ���� �� �� ���� ���� �ϴ��� ���
		
		int year = 0;
		int month = 0;
		int days = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����(����)�� �Է��ϼ���: ");
		year = sc.nextInt();
		System.out.print("��(����)�� �Է��ϼ���: ");
		month = sc.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 8:
		case 7:
		case 10:
		case 12:
			days = 31;
			break;
		case 2:
			if ((year % 400 == 0 || year % 4 == 0) && year % 100 != 0) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			System.out.println("1���� 12�� ���� �߿� �����ϼ���.");
			break;
		}
		
		System.out.println(month + "���� ��¥���� " + days + "�Դϴ�.");
		
	}
	
}

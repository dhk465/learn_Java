package ex2_continue;

import java.util.Scanner;

public class Ex3_continue {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1. ���ӽ���");
			System.out.println("2. ��������");
			System.out.println("3. ��������");
			System.out.print(" >> ");
			
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("���� ����â ����â");
				break;
			case 2:
				System.out.println("��վ��.");
				break;
			case 3:
				System.out.println("����");
				break;
			default:
				System.out.println("�޴������� �ùٸ��� �ʽ��ϴ�.");
				continue;
			}
		
			System.out.println("����� while�� ����");
		
		}
	}
}

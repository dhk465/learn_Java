package ex4_control_statement;

import java.util.Scanner;

public class Ex2_for {

	public static void main(String[] args) {
		
		// Ű����� 2-9 ������ ������ �Է¹ް�
		// �Է¹��� ���ڿ� �ش�Ǵ� �������� ���
		
		for (;;) {
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �ܼ�(����)�� �Է��ϼ���. �����Ϸ��� 0�� �Է�: ");
			int dan = sc.nextInt();
			
			if (dan > 1 && dan < 10) {
				System.out.println(dan + "��");
				for (int i = 1; i < 10; i++) {
					System.out.println(dan + " * " + i + " = " + (dan * i));
				}
			} else if (dan == 0) {
				break;
			} else {
				System.out.println("2���� 9������ �������� �Է��ϼ���.");
			}
		}
	}
}


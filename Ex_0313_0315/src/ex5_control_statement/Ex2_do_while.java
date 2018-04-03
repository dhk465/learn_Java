package ex5_control_statement;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		
		// �� ó��, �� ��
		
		int num = 1;
		
		do {
			System.out.println(num--);
		} while(num > -12);
		// starting with the comparison: 0 > -12
		
		System.out.println("-------------------------");
		
		/*	Java, JSP, Spring ������ ���� ���� ������ 0-130���� ���Եȴ�.
		 	�� ������ do-while������ �˻��ϵ� 100���� �Ѿ�� 100�� ���ϰ� �ǵ���
		 	������ ��߻� ��Ų��.
		 
		 	��� 100�� ���ϰ� �Ǹ� �ݺ����� �������� �� ���� ������ ȭ�鿡 ��½�Ų��. */

		int java;
		int jsp;
		int spring;
		
		do {
			java = new Random().nextInt(131);
			jsp = new Random().nextInt(131);
			spring = new Random().nextInt(131);
		} while (java > 100 || jsp > 100 || spring > 100);
		
		System.out.printf("Java: %d��\nJSP: %d��\nSpring: %d��", java, jsp, spring);
		
	}
}

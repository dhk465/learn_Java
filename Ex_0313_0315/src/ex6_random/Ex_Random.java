package ex6_random;

import java.util.Random;

public class Ex_Random {
	public static void main(String[] args) {
		//					.nextInt(��������) + ���ۼ�;
		// 					.nextInt(ū �� - ������ + 1) + ���ۼ�)
		int num = new Random().nextInt(5) + 1;
		
		System.out.println(num);
		
		// 3 - 10 ������ ����
		num = new Random().nextInt(10 - 3 + 1) + 3;
		
		System.out.println(num);
		
		System.out.println("--------------");
		
		// 2 - 9 ������ ������ �߻����Ѽ� ������ ���
		
		num = new Random().nextInt(9 - 3 + 1) + 2;
		
		System.out.println(num + "��");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %02d\n", num, i, (num * i));
		} // ������
		
		System.out.println("--------------");
		
		int ch = new Random().nextInt(90 - 65 + 1) + 65;
		// Ȥ�� char ch = (char)(Random().nextInt(90 - 65 + 1) + 65);
		// ('Z' - 'A' + 1) + 'A' ���� ����
		System.out.println((char)ch);
		
	} // main
} // class

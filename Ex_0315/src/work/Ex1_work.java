package work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		// ��ĳ�ʸ� ���� ���� n�� ���� �Է�
		// 1���� n������ ���� ����Ͽ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int n = sc.nextInt();
		int result = 0;
		
		for (int i = n; i > 0; i--) {
			result += i;
		} 
		
		System.out.printf("1���� %d������ �հ�: %d", n, result);
		
	}
}

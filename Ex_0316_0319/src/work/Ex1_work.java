package work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		// Ű���忡�� ���� n1, n2�� ���� �޴´�
		// n1���� n2������ ���� ����Ͽ� ����� ���
		// n1�� n2 �� ���� ������ �����Ͽ� ū ������ ���� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է�: ");
		int n1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է�: ");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}
		
		int sum = 0;
		
		for (int i = n1; i < n2 + 1; i++) {
			sum += i;
		}
		
		System.out.printf("%d���� %d������ ��: %d\n", n1, n2, sum);
		
	}
}

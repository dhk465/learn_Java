package ex4_thread;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		
		// ������ �Է¹ް�
		// �Է¹��� ���ڸ� 1�� ����
		// 0�� �Ǹ� ����޽��� ���
		// ��, ���� �޴� �ڵ�� main����
		// 1�� ���ҽ�Ű�� �ڵ�� ThreadCount����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
				
		ThreadCount tc = new ThreadCount(num);
		Thread th = new Thread(tc);
		
		th.start();
		
	}
}

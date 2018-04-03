package ex2_multi_array;

import java.util.Scanner;

public class Ex6_MultiArray {
	public static void main(String[] args) {
		
		// �л����� ����+������� ����ϴ� ���α׷�
		// ���α׷��� �����ϸ� ����� ������ �������� �Է¹ް�
		// �Է¹��� �� ��ŭ �̸�, ����, ������� ���
		// ���� ������ ���� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �л� ���� �Է��ϼ���: ");
		int num = sc.nextInt();
		String[] subject = {"����", "����", "����", "��2�ܱ���"};
		String[][] grade = new String[num][subject.length + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("�л��̸�: ");
			grade[i][0] = sc.next();
			for (int j = 0; j < subject.length; j++) {
				System.out.printf("%s����: ", subject[j]);
				String score = sc.next();
				grade[i][j+1] = score;
			}
			System.out.println("-------------------");
		}
		
		System.out.println(num + "�� ��� �Ϸ�!!");
		System.out.printf("�̸�\t");
		for (int i = 0; i < subject.length; i++) {
			System.out.printf("%s\t", subject[i]);
		} // �̸� + ����� Ÿ��Ʋ ���
		System.out.println();
		for (int i = 0; i < grade.length; i++) {
			System.out.printf("%s\t", grade[i][0]); // �л� �̸� ���
			for (int j = 0; j < subject.length; j++) {
				System.out.printf("%s\t", grade[i][j+1]);
			} // �� i �л��� ����, ���񺰷� ���
			System.out.println();
		}
		
	}
}

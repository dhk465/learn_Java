package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		// ��ü �������� 2����: �Ͻ���, �����
		// �ѹ� ������ ���ڿ��� ������ ������ �ʴ´�. (�Һ��� Ư¡)
		
		String s1 = "abc"; // ��ü: Ŭ�����κ��� ������� ����
		String s2 = "abc"; // *�Ͻ��� ��ü����
		
		if (s1 == s2) { // ��ü�� ==�� ���� heap �ּҸ� ��
			System.out.println("s1�� s2�� �ּҰ� �����ϴ�.");
		} else {
			System.out.println("s1�� s2�� �ּҰ� �ٸ��ϴ�.");
		}
		
		Scanner sc = new Scanner(System.in);
		String s3 = new String("abc"); // new�� ������ ������ *����� ��ü����
		String s4 = sc.next();
		
		if (s3 == s4) { // ��ü�� ==�� ���� heap �ּҸ� ��
			System.out.println("s3�� s4�� �ּҰ� �����ϴ�.");
		} else {
			System.out.println("s3�� s4�� �ּҰ� �ٸ��ϴ�.");
		}
		
		if (s3.equals(s4)) { // ��Ʈ�� Ŭ������ "��" ��
			System.out.println("s3�� s4�� ���� �����ϴ�.");
		} else {
			System.out.println("s3�� s4�� ���� �ٸ��ϴ�.");
		}
		
		String s5 = "ȫ�浿"; 
		s5 += "�ȳ��ϼ���";
		// �޸� �ּ� �󿡼��� "ȫ�浿"�� garbage-collect�ǰ�, "ȫ�浿�ȳ��ϼ���"�� ���ο� �ּҸ� s5�� �޴´� (�Һ��� Ư¡)
		System.out.println(s5);
		
	}
}
